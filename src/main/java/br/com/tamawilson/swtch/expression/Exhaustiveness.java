package br.com.tamawilson.swtch.expression;

public class Exhaustiveness {

    public static void main(String[] args) {

        var tipoProduto = TipoProduto.ELETRODOMESTICO;

        String mensagem = switch (tipoProduto) {
            case ELETRONICO -> "Categoria ELETRONICO";
            case ELETRODOMESTICO -> "Categoria ELETRODOMESTICO";
            case MOVEIS -> "Categoria MOVEIS";
            case INFORMATICA -> "Categoria INFORMATICA"; //Apague esse case e veja o que acontece.
        };

        System.out.println(mensagem);
    }

    private enum TipoProduto {
        ELETRONICO, ELETRODOMESTICO, MOVEIS, INFORMATICA
    }
}
