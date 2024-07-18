import java.util.Scanner;

// Treino principal: Saudações baseadas na hora do dia
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        while (true) {
            System.out.println("Que horas sao?");
            hora = sc.nextInt();
            sc.nextLine();

            if (hora < 12) {
                System.out.println("BOM DIA");
                break;
            } else if (hora < 17) {
                System.out.println("BOA TARDE");
                String bt = sc.nextLine();
                if (bt.equalsIgnoreCase("BOA TARDE")) {
                    System.out.println("Tudo bem?");
                } else {
                System.out.println("Desculpe, não posso ajudar com isso.");                }
                break;
            } else if (hora < 24) {
                System.out.println("BOA NOITE");
                break;
            } else {
                System.out.println("o dia tem 24h");
            }
        }
    }
}