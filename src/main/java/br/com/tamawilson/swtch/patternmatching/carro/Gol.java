package br.com.tamawilson.swtch.patternmatching.carro;

public record Gol() implements Carro {
    @Override
    public void ligar() {
        System.out.println("vrum vrum");
    }
}