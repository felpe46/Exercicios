package Lista2;

import java.util.Scanner;

public class ls1ex04 {
    public static void main(String[] args){
        int Codigo1;
        double Valor1;
        int Quant1;
        int Codigo2;
        double Valor2;
        int Quant2;
        double Ipi;
        String linha;
        linha = "================================================";

        Scanner sc = new Scanner(System.in);

        System.out.printf("%s%n", linha);

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        Ipi = sc.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        Codigo1 = sc.nextInt();

        System.out.print("Digite o valor unítario da peça 1: ");
        Valor1 = sc.nextInt();

        System.out.print("Digite a quantidade de peças 1: ");
        Quant1 = sc.nextInt();

        System.out.printf("%s%n", linha);
        System.out.printf("%s%n", linha);

        System.out.print("Digite o código da peça 2: ");
        Codigo2 = sc.nextInt();

        System.out.print("Digite o valor unítario da peça 2: ");
        Valor2 = sc.nextInt();

        System.out.print("Digite a quantidade de peças 2: ");
        Quant2 = sc.nextInt();

        System.out.printf("%s%n", linha);

        System.out.printf("valor do produto 1 com codigo %d e o produto 2 com  codigo %d%n", Codigo1, Codigo2);
        System.out.printf("O valor total é de: %.2f%n", (Valor1 * Quant1 + Valor2 * Quant2) * (Ipi/100  + 1));

        sc.close();
    }
}