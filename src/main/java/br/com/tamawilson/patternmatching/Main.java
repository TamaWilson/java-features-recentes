package br.com.tamawilson.patternmatching;

@SuppressWarnings({"java:S6201", "ConstantConditions"})
public class Main {

    public static void main(String[] args) {

        //Como era antes
        Carro carro = new Gol();

        if (carro instanceof Gol) {
            Gol gol = (Gol) carro;
            gol.ligar();
        } else if (carro instanceof Ferrari) {
            Ferrari ferrari = (Ferrari) carro;
            ferrari.ligar();
        }

        //Como podemos fazer agora
        Carro carro2 = new Gol();

        if (carro2 instanceof Gol gol) {
            gol.ligar();
        } else if (carro2 instanceof Ferrari ferrari) {
            ferrari.ligar();
        }

    }

    private interface Carro {
        void ligar();
    }

    private record Gol() implements Carro {
        @Override
        public void ligar() {
            System.out.println("vrum vrum");
        }
    }

    private record Ferrari() implements Carro {
        @Override
        public void ligar() {
            System.out.println("Vruuuuuuuuuuuuum vrum vrum");
        }
    }
}
