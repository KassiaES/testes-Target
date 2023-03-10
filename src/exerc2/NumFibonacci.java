package exerc2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
 * escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci
 * e retorne uma mensagem avisando se o número informado pertence ou não a sequência.
 */

public class NumFibonacci {

    public static void main(String[] args) {

        boolean validated = false;
        int numFibo =  1;
        int numContole = 0;

        int num = getNumero("Digite um número inteiro e positivo: ");

        do {
            numFibo = numFibo + numContole;
            numContole = numFibo - numContole;
            //System.out.println(numFibo);
            if (numFibo == num) {
                validated = true;
            } else validated = false;

        } while (numFibo < num);

        if (validated == true) {
            System.out.println("O número pertence a sequência de Fibonacci!");
        } else System.out.println("O número não pertence a sequência de Fibonacci!");


    }

    public static int getNumero (String frase){
        System.out.println(frase);
        Scanner scan = new Scanner(System.in);
        try {
            return scan.nextInt();
        } catch (InputMismatchException e) {
            return getNumero("Tente novamente");
        }
    }

}
