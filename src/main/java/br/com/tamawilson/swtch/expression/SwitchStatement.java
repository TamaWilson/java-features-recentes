package br.com.tamawilson.swtch.expression;

public class SwitchStatement {

    public static void main(String[] args) {
        //Switch para alterar valor de uma variável
        int nota = 6;

        String mensagem;
        switch (nota) {
            case 10:
                mensagem = "Excelente!";
                break;
            case 8:
                mensagem = "Muito bom!";
                break;
            case 6:
                mensagem = "Bom!";
                break;
            case 4:
                mensagem = "Suficiente!";
                break;
            case 2:
                mensagem = "Insuficiente!";
                break;
            default:
                mensagem = "Nota inválida!";
                break;
        }

        System.out.println("Switch Atribuindo Valor: " + mensagem);

//        Swtich como retorno de um método
        String mensagemRetorno = avaliarNota(8);
        System.out.println("Switch Como Retorno: " + mensagem);

    }

    private static String avaliarNota(int nota) {
         switch (nota) {
            case 10:
                return "Excelente!";
            case 8:
                return "Muito bom!";
            default:
                return "Nota inválida!";
        }
    }

}
