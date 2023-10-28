package Lista2;//Faça um algoritmo para receber um número qualquer e informar na tela se é par ou ímpar.

import java.util.Scanner;

public class ls2ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.print("Esse número é par");
        }
        else {
            System.out.print("Esse número é ímpar");
        }
    }
}
