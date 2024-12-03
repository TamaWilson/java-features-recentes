package br.com.tamawilson.swtch.expression;

public class ArrowLabels {

    public static void main(String[] args) {
        //Arrow Labels "->"
        int nota = 8;
        String mensagem = switch (nota) {
            case 10 -> "Excelente!";
            case 8 -> "Muito bom!";
            case 6 -> "Bom!";
            case 4 -> "Suficiente!";
            case 2 -> "Insuficiente!";
            default -> "Nota inválida!";
        };

        System.out.println("Arrow Labels: " + mensagem);

    }
}
