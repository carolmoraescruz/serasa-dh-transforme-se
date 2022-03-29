package aula220314;

// Notas de aula referentes ao dia 14/03/2022, sobre condicionais.

public class Condicionais {

    public static void main(String[] args) {
        double salario = 2758.33;
        // imprimir acima da média caso o salário seja maior que 2500

        // IF
        if (salario >= 2500) {
            System.out.println("Acima da média");
        }

        // IF-ELSE
        if (salario >= 2500) {
            System.out.println("Acima da média");
        } else {
            System.out.println("Abaixo da média");
        }

        // IF-ELSE IF
        if (salario >= 2500) {
            System.out.println("Acima da média");
        } else if (salario < 1000) {
            System.out.println("Muito abaixo da média");
        } else {
            System.out.println("Na média");
        }

        // FORMA TERN�RIA
        String resposta = (salario >= 2500) ? "Acima da média" : "Abaixo da média";
        System.out.println(resposta);

        // SWITCH
        int opcao = 4;

        switch (opcao) {
            case 1:
                System.out.println("Problema técnico");
                break;
            case 2:
                System.out.println("Problema financeiro");
                break;
            case 3:
                System.out.println("Promoções");
                break;
            case 9:
                System.out.println("Fale com um de nossos atendentes");
                break;
            default:
                System.out.println("O número digitado é inválido");
        }

    }

}
