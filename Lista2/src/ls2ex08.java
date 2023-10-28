// Escreva  um  algoritmo  que  leia  três  valores  inteiros  e  diferentes  e  mostre-os  em  ordem decrescente.

import java.util.Scanner;

public class ls2ex08 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int [] numbers = new int[3];

        for (int i = 0; i < 3; i++ ){
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }
        int maior = numbers[0];
        for (int m = 1; m < numbers.length; m++){
            if (numbers[m] > maior){
                maior = numbers[m];
            }
        }
        int menor = numbers[0];
        for (int m = 1; m < numbers.length; m++){
            if (numbers[m] < menor){
                menor = numbers[m];
            }
        }
        int meio = numbers[0];
        for (int m = 1; m < numbers.length; m++){
            if (numbers[m] > menor && numbers[m] < maior){
                meio = numbers[m];
            }
        }

        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);

    }
}
