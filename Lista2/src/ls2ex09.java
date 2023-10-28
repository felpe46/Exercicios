// Tendo  como  dados  de  entrada  a  altura  e  o  sexo  de  uma  pessoa,  construa  um  algoritmo  que calcule
// seu peso ideal, utilizando as seguintes fórmulas:
// ● para homens: (72.7 * h) – 58;
// ● para mulheres: (62.1 * h) – 44.7.

import java.util.Scanner;

public class ls2ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        System.out.print("Sexo:[M/F]: ");
        char sexo = sc.next().toUpperCase().charAt(0);
        sc.nextLine();

        if (sexo == 'M'){
            double pi = (72.7 * altura) - 58;
            System.out.printf("O seu peso ideal Masculino é: %.2f%n", pi);
        } else if (sexo == 'F') {
            double pi = (62.1 * altura) - 44.7;
            System.out.printf("O seu peso ideal Feminino é: %.2f%n", pi);
        }
    }
}
