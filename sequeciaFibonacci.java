// 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

// IMPORTANTE:
// Esse número pode ser informado através de qualquer entrada de sua preferência ou pode ser previamente definido no código;

import java.util.Scanner;

public class sequeciaFibonacci {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int sequecia = 0;
        int somatorio = 1;
        int numeroAtual = 0;

        System.out.print("Digite um número: ");
        int numeroSelecionado = leitor.nextInt();

        while (numeroSelecionado <= numeroAtual) {
            numeroAtual = sequecia + somatorio;
            sequecia = somatorio;
            somatorio = numeroAtual;
        }

        if (numeroSelecionado == 0) {
            System.out.println("Seu número faz parte da sequência de Fibonacci!");
        } else if (numeroSelecionado == numeroAtual) {
            System.out.println("Seu número faz parte da sequência de Fibonacci!");
        } else {
            System.out.println("Seu número não faz parte da sequência de Fibonacci!");
        }

    }
}
