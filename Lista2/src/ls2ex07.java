//Faça  um  algoritmo  que  leia  uma  variável  e  some  5  caso  seja  par  ou  some  8  caso  seja  ímpar,
// imprimir o resultado desta operação.

import java.util.Scanner;

public class ls2ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            num += 5;
            System.out.printf("Este número é par %d%n", num);
        }
        else{
            num += 8;
            System.out.printf("Este número é ímpar %d%n", num);
        }
    }
}
