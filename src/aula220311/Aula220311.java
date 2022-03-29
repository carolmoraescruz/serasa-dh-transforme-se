package aula220311;

// Notas de aula referentes ao dia 11/03/2022.

public class Aula220311 {

    public static void main(String[] args) {
        // criação de um atributo (atributo é a variável do Java) para o tipo Texto
        String nomeDoAluno = "Caroline";
        String sobrenomeDoAluno = "Moraes da Cruz";

        // criação de um atributo para tipos numéricos - escolher o tipo adequado para
        // evitar comprometer memória desnecessariamente

        // números inteiros do tipo longo (maior de todos)
        long numeroLongo = 21654984303L; // tem que colocar o "L" no final

        // números inteiros do tipo inteiro de -2.147.483.648 até 2.147.483.647
        int idade = 30;

        // números inteiros do tipo short 16 bits -32.768 até 32.767
        short numeroShort = 220;

        // números inteiros do tipo byte 8 bits -128 até 127
        byte numeroByte = 9;

        // números de ponto flutuante
        float nota = 8.5f; // tem que colocar o f no final
        double mensalidade = 1785.655489491; // float grandão, não precisa do f no final

        System.out.println("Nome: " + nomeDoAluno);
        System.out.println("Sobrenome: " + sobrenomeDoAluno);
        System.out.println("Número longo: " + numeroLongo);
        System.out.println("Idade: " + idade);
        System.out.println("Número short: " + numeroShort);
        System.out.println("Número byte: " + numeroByte);
        System.out.println("Nota: " + nota);
        System.out.println("Mensalidade: " + mensalidade);

    }

}
