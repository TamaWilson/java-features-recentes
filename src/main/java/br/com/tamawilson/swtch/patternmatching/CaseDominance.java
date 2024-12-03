package br.com.tamawilson.swtch.patternmatching;

import java.util.function.Function;

public class CaseDominance {

    public static void main(String[] args) {

        Integer numero = 10;

        switch(numero){
            case Integer i -> System.out.println("É um numero");
//            case 10 -> System.out.println("O numero é 10"); // Tire o comentário, veja o erro de compilação por conta da dominância.
        }
    }
}
