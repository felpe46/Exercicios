import java.util.Scanner;

public class ls1ex05 {
    public static void main(String[] args){
        double Sm;
        Sm = 788;
        double SmUsuario;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quanto você ganha mensalmente: ");
        SmUsuario = sc.nextDouble();

        System.out.printf("Você ganha o equivalente a %.2f salarios minimos.", SmUsuario / Sm);

        sc.close();
    }
}
