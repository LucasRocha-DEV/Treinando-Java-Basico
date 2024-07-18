import java.util.Scanner;

public class exCondicionais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero:");
        int minutos = sc.nextInt();

        double conta = 50.0;
        double valorTotal;

        if (minutos >= 100) {
            valorTotal = conta + 2.0 * (minutos - 100);
        } else {
            valorTotal = conta;
        }
        System.out.println("Valor a pagar: " + valorTotal);
    }
}
// se minutos for menos ou igual a 100, a conta é de 50.0
// se minutos for maior que 100, a conta é de 50.0 + 2.0 * (minutos - 100)