package br.com.tamawilson.swtch.patternmatching;

public class GuardedPattern {

    public static void main(String[] args) {

        Object obj = 42;
        guardedPattern(obj);

    }

    public static void guardedPattern(Object o) {
        switch (o) {
            case Integer i when i > 100 -> System.out.println("O número é maior que 100");
            case Integer i when i > 50 -> System.out.println("O número é maior que 50");
            case Integer i -> System.out.println("O número é menor que 50");
            default -> System.out.println("Unknown type");
        }
    }
}
