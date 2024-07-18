import java.util.Scanner;

public class comparacaoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("digite o primeiro numero");
            int numero1 = sc.nextInt();
            System.out.println("digite o segundo numero");
            int numero2 = sc.nextInt();

            if (numero1 >= numero2) {
                System.out.println("numero 1 é maior que numero 2");
            } else {
                System.out.println("numero 1 nao é maior que o numero 2!! ");
            }

            int numero1e2 = numero1 + numero2;

            if (numero1e2 == 20) {
                System.out.println("deu 20");
                continuar = false;
            } else {
                System.out.println("nao deu 20!");
            }
        }
    }
}
