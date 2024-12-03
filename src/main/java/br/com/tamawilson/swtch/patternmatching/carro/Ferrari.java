package br.com.tamawilson.swtch.patternmatching.carro;

public record Ferrari() implements Carro {
    @Override
    public void ligar() {
        System.out.println("Vruuuuuuuuuuuuum vrum vrum");
    }
}