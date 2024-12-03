package br.com.tamawilson.swtch.patternmatching;

import br.com.tamawilson.swtch.patternmatching.carro.Carro;
import br.com.tamawilson.swtch.patternmatching.carro.Ferrari;
import br.com.tamawilson.swtch.patternmatching.carro.Gol;

public class NullCheck {

    public static void main(String[] args) {
        Carro carro = null;
        ligarCarro(carro);
    }

    private static void ligarCarro(Carro carro) {
        switch(carro) {
            case null -> System.out.println("Cara, cadê meu carro?");
            case Gol gol -> gol.ligar();
            case Ferrari ferrari -> ferrari.ligar();
            default -> System.out.println("Carro desconhecido");
        }
    }

}
