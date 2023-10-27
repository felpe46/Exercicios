package Lista2;
//Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B é menor que C.

import java.util.Scanner;

public class ls2ex01 {
    public static void main(String[] args){
        double num1;
        double num2;
        double num3;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite um número: ");
        num2 = sc.nextDouble();

        System.out.print("Digite um número: ");
        num3 = sc.nextDouble();

        if (num1 + num2 > num3){
            System.out.print("A soma dos dois primeiros números, é maior que o terceiro número.");
        }
        else if (num1 + num2 == num3) {
            System.out.print("A soma dos dois primeiros números é igual ao valor do terceiro número.");
        }
        else{
            System.out.print("A soma dos dois priemeiros números é menor que o terceiro número.");
        }
    }
}
