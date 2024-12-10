package br.com.tamawilson.swtch.patternmatching.carro;

public sealed interface Carro permits Gol, Ferrari {
        void ligar();
    }