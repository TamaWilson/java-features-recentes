package br.com.tamawilson.swtch.expression;

public class SwitchExpression {

    public static void main(String[] args) {
        //Yeld
        int nota = 6;

        String mensagem = switch (nota) {
            case 10:
                yield "Excelente!";
            case 8:
                yield "Muito bom!";
            case 6:
                yield "Bom!";
            case 4:
                yield "Suficiente!";
            case 2:
                yield "Insuficiente!";
            default:
                yield "Nota inválida!";
        };

        System.out.println(mensagem);
    }
}
