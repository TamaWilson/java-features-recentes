package br.com.tamawilson.swtch.patternmatching;

import java.util.function.Function;

public class CaseDominance {

    public static void main(String[] args) {

        Integer numero = 10;

        /* A ordem do switch é importante, pois o primeiro case que for verdadeiro será executado e os demais ignorados.
           No exemplo abaixo numero é Integer, por isso case 10 nunca será executado devido a dominância do primeiro case
        */
        switch(numero){
            case Integer i -> System.out.println("É um numero");
//            case 10 -> System.out.println("O numero é 10"); // Tire o comentário, veja o erro de compilação por conta da dominância.
        }
    }
}
