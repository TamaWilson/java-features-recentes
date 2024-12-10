package br.com.tamawilson.swtch.patternmatching;

import br.com.tamawilson.swtch.patternmatching.carro.Carro;
import br.com.tamawilson.swtch.patternmatching.carro.Ferrari;
import br.com.tamawilson.swtch.patternmatching.carro.Gol;

public class SealedClasses {

    public static void main(String[] args) {

        Carro carro = new Ferrari();

        /* Carro é uma interface selada, por isso o java entende que você precisa cobrir todos os tipos que implementam Carro
           caso você não faça, sua IDE e o compilador vão informar o erro e exigir que você corrija a implementação */

        switch (carro) {
            case Gol gol -> gol.ligar();
            case Ferrari ferrari -> ferrari.ligar(); //Comente essa linha e veja o erro em tempo de compilação
            //Experimente criar um novo carro
        }
    }
}
