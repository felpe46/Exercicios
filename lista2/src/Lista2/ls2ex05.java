package Lista2;
// Encontrar  o  dobro  de  um  número  caso  ele  seja  positivo  e  o  seu  triplo  caso  seja  negativo,
// imprimindo o resultado.

import java.util.Scanner;

public class ls2ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        int cont;

        if (num >= 0){
            cont = num * 2;
            System.out.printf("o dobro de %d é igual a %d%n",num, cont);
        } else if (num < 0) {
            cont = num * 3;
            System.out.printf("O triplo de %d é igual a %d%n",num, cont);
        }
    }
}
