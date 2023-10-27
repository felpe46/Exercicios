//Faça  um  algoritmo  que  leia  dois  valores  inteiros  A  e  B  se  os  valores  forem  iguais  deverá  se somar  os
// dois,  caso  contrário  multiplique  A  por  B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado para
// uma variável C e mostrar seu conteúdo na tela.

import java.util.Scanner;

public class ls2ex04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int A = sc.nextInt();

        System.out.print("Digite um número: ");
        int B = sc.nextInt();

        if (A == B){
            int C = A + B;
            System.out.printf("O valor da soma dos dois primeiros números é: %d%n", C);
        }
        else {
            int C = A * B;
            System.out.printf("O valor da mutiplicação dos dois primeiros números é: %d%n", C);
        }
    }
}
