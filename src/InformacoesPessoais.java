// src/InformacoesPessoais.java

// Treino de exibição de informações pessoais formatadas
public class InformacoesPessoais {
    public static void main(String[] args) {
        int y = 32;
        double x = 10.35784;
        String nome = "Lucas";
        int idade = 27;
        double renda = 11.000;

        System.out.println(y);
        System.out.printf("%.3f%n", x);
        System.out.println("Bom Dia!");
        System.out.printf("%s tem %d anos e ganha R$ %.3f reais %n", nome, idade, renda);
    }
}