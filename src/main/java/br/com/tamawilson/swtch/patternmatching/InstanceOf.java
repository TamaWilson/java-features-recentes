package br.com.tamawilson.swtch.patternmatching;

import br.com.tamawilson.swtch.patternmatching.carro.Carro;
import br.com.tamawilson.swtch.patternmatching.carro.Ferrari;
import br.com.tamawilson.swtch.patternmatching.carro.Gol;

public class InstanceOf {

    public static void main(String[] args) {

        Carro carro = new Ferrari();
        ligarCarro(carro);

    }

    private static void ligarCarro(br.com.tamawilson.swtch.patternmatching.carro.Carro carro) {
        switch(carro) {
            case Gol gol -> gol.ligar();
            case Ferrari ferrari -> ferrari.ligar();
            default -> System.out.println("Carro desconhecido");
        }
    }
}
