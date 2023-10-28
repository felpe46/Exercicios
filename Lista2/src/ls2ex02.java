// solicitar o tempo de casada (anos).

import java.util.Scanner;

public class ls2ex02 {
    public static void main(String[] args){
        String nome;
        String ec;
        char sexo;
        int anos;
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        nome = sc.nextLine();

        System.out.print("Sexo:[M/F] ");
        sexo = sc.next().toUpperCase().charAt(0);
        sc.nextLine();

        System.out.print("Estado civil: ");
        ec = sc.nextLine().toUpperCase();

        if (ec.equals("CASADA") && sexo == 'F'){
            System.out.print("Tempo de casada em anos: ");
            anos = sc.nextInt();
            System.out.printf("%s%n%C%n%s%n",nome, sexo, ec);
        }
        else {
            System.out.printf("%s%n%C%n%s%n",nome, sexo, ec);
        }
    }
}
