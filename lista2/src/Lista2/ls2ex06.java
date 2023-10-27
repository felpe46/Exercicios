package Lista2;
//Escreva um algoritmo que lê dois valores booleanos (lógicos) e então determina se ambos
//são VERDADEIROS ou FALSOS.

import java.util.Random;

public class ls2ex06 {
    public static void main(String[] args) {

        Random gerador =  new Random();

        int A = gerador.nextInt(-10, 10);
        int B = gerador.nextInt(-10, 10);
        boolean num;
        int C;

        if (A + B < 0){
            num = false;
             C = A + B;
        }
        else {
            num = true;
            C = A + B;
        }
        System.out.println(num);
        System.out.println(C);
    }
}
