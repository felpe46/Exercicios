import java.util.Scanner;

public class ls1ex01 {
    public static void main(String[] args){
        int IdadeAnos;
        int IdadeMesses;
        int IdadeDias;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade em anos: ");
        IdadeAnos = sc.nextInt();
        System.out.print("Digite a sua idade em messes: ");
        IdadeMesses = sc.nextInt();
        System.out.print("Digite a sua idade em dias: ");
        IdadeDias = sc.nextInt();

        System.out.printf("A sua idade em dias é: %d dias.%n", IdadeAnos*365 + IdadeMesses*30 + IdadeDias);

    }
}
