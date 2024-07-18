// src/ListaNomes.java
import java.util.ArrayList;
import java.util.Scanner;

// Treino de manipulação de ArrayList e entrada de dados
public class ListaNomes {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String nome;

        do {
            System.out.println("Digite o Nome");
            nome = sc.next();
            nomes.add(nome);
        } while (!nome.equals("Lucas"));

        System.out.println("Voce digitou Lucas!");
        System.out.println("Nomes digitados antes:");
        for (String nomeDigitado : nomes) {
            System.out.println(nomeDigitado);
        }
    }
}