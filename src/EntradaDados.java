// src/EntradaDados.java
import java.util.Scanner;

// Treino de entrada e exibição de dados
public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
