import java.util.Scanner;

public class ls1ex03 {
    public static void main(String[] args){
        double saldo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o seu salario: ");
        saldo = sc.nextDouble();
        System.out.printf("O seu salario com reajuste é: %.1f", saldo * 1.01);
    }
}