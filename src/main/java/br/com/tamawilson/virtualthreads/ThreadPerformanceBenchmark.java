package br.com.tamawilson.virtualthreads;

import java.util.concurrent.*;

//https://medium.com/@avinashsingh1152/thread-vs-virtual-thread-in-java-unraveling-the-differences-728de6eaa02d
public class ThreadPerformanceBenchmark {
    public static void main(String[] args) throws InterruptedException {
        int n = 1000000000; // Número para cálculo do fatorial
        int numThreads = 10; // Número de threads

        // Execução em threads tradicionais
        long startTime = System.nanoTime();
        computeFactorialTraditional(n, numThreads);
        long endTime = System.nanoTime();
        long traditionalTime = endTime - startTime;

        // Execução em threads virtuais
        startTime = System.nanoTime();
        computeFactorialVirtual(n, numThreads);
        endTime = System.nanoTime();
        long virtualTime = endTime - startTime;

        // Resultados
        System.out.println("Tempo de execução das threads tradicionais: " + traditionalTime + " ns");
        System.out.println("Virtual Threads Execution Time: " + virtualTime + " ns");
        System.out.println("Performance Difference: " + (traditionalTime - virtualTime) + " ns");
    }

    // Implementação com threads tradicionais
    private static void computeFactorialTraditional(int n, int numThreads) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(numThreads); //Cria um pool de threads com quantidade fixa
        long[] result = new long[numThreads];
        //Divide a execução em blocos
        int blockSize = n / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * blockSize + 1;
            int end = (i == numThreads - 1) ? n : (i + 1) * blockSize;
            int finalI = i;
            executor.submit(() -> { //Iniciaiza as tarefas
                result[finalI] = computeFactorialInRange(start, end);
            });
        }
        executor.shutdown();
        executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }
    // Implementação com threads virtuais
    private static void computeFactorialVirtual(int n, int numThreads) throws InterruptedException {
        Thread[] threads = new Thread[numThreads]; //Cria um array de Threads
        long[] result = new long[numThreads];
        //Divide a execução em blocos
        int blockSize = n / numThreads;
        for (int i = 0; i < numThreads; i++) {
            int start = i * blockSize + 1;
            int end = (i == numThreads - 1) ? n : (i + 1) * blockSize;
            int finalI = i;
            threads[i] = Thread.startVirtualThread(() -> {  //Inicializa as tarefas
                result[finalI] = computeFactorialInRange(start, end);
            });
        }
        // Wait for all threads to complete
        for (Thread thread : threads) {
            thread.join();
        }
    }
    // Algoritmo de cálculo do fatorial
    private static long computeFactorialInRange(int start, int end) {
        long factorial = 1;
        for (int i = start; i <= end; i++) {
            factorial *= i;
        }
        return factorial;
    }
}