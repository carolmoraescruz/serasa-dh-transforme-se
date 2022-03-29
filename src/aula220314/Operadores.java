package aula220314;

// Notas de aula referentes ao dia 14/03/2022, sobre operadores.

public class Operadores {

    public static void main(String[] args) {
        // Operadores aritm�ticos

        int valor1 = 10;
        int valor2 = 5;

        System.out.println("Operadores aritméticos: \n");
        System.out.println("Resultado soma.........: " + (valor1 + valor2));
        System.out.println("Resultado subtração....: " + (valor1 - valor2));
        System.out.println("Resultado multiplicação: " + (valor1 * valor2));
        System.out.println("Resultado divisão......: " + (valor1 / valor2));
        System.out.println("Resultado MOD..........: " + (valor1 % valor2));

        System.out.println("\n========================================== \n");

        // Operadores relacionais

        System.out.println("Operadores aritméticos: \n");
        System.out.println("Valor 1 é maior que valor 2....: " + (valor1 > valor2));
        System.out.println("Valor 1 é maior igual a valor 2: " + (valor1 >= valor2));
        System.out.println("Valor 1 é menor que valor 2....: " + (valor1 < valor2));
        System.out.println("Valor 1 é menor igual a valor 2: " + (valor1 <= valor2));
        System.out.println("Valor 1 é igual a valor 2......: " + (valor1 == valor2));
        System.out.println("Valor 1 é diferente de valor 2.: " + (valor1 != valor2));

        System.out.println("\n========================================== \n");

        // Operadores l�gicos

        System.out.println("Operadores lógicos: \n");

        float nota = 8.5f;
        float frequencia = 74.0f;

        System.out.println("Nota >= 7 E frequência >= 75........: " + (nota >= 7 && frequencia >= 75));
        System.out.println("Nota >= 7 OU frequência >= 75.......: " + (nota >= 7 || frequencia >= 75));
        System.out.println("NEGAÇÃO Nota >= 7 E frequência >= 75: " + (!(nota >= 7 && frequencia >= 75)));

        System.out.println("\n========================================== \n");

    }

}
