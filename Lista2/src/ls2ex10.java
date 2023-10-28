//O  IMC  –  Indice  de  Massa  Corporal  é  um  critério  da  Organização  Mundial  de  Saúde  para  dar uma indicação
// sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2 Elabore  um  algoritmo  que  leia
// o  peso  e  a  altura de  um  adulto  e  mostre  sua  condição  de  acordo com a tabela abaixo.

import java.util.Scanner;

public class ls2ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        double peso = sc.nextDouble();

        System.out.print("Digite a sua altura: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc <= 18.5) {
            System.out.println("Você está acima do peso.");
        }
        else if (imc > 18.5 && imc <= 25 ) {
            System.out.println("Peso normal.");
        }
        else if (imc > 25 && imc <= 30) {
        System.out.println("Acima do peso.");
        }
        else if (imc > 30) {
        System.out.println("Obeso(a).");
        }
    }
}
