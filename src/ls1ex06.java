import java.util.Scanner;

public class ls1ex06 {
    public static void main(String[] args){
        int numero;
        int sucessor;
        int antecessor;


        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        sucessor = numero + 1;
        antecessor = numero - 1;

        System.out.printf("O antecessor do número %d é: %d", numero, antecessor);
        System.out.println();
        System.out.printf("O sucessor do número %d é: %d", numero, sucessor);

        sc.close();
    }
}
