package br.com.tamawilson.swtch.expression;

public class MultipleCases {

    public static void main(String[] args) {
        //Multiplos valores no case
        int nota = 6;

        String mensagem = switch (nota) {
            case 10, 9, 8 -> "Excelente!";
            case 7, 6, 5 -> "Muito bom!";
            case 4 -> "Vai para recuperação";
            default -> throw new RuntimeException("REPROVADO!");
        };

        System.out.println(mensagem);

    }
}
