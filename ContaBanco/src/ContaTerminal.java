import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //classe Scanner para leitura de entradas
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String Agencia;
        String NomeCliente = "MARIO ANDRADE";
        double Saldo = 237.48;
        int Usuario;

        //Loop para validar a agência
        while (true) {
            System.out.println("Por favor, digite o número da Agência");
            Agencia = scanner.next();
            if (Agencia.equals("067-8")) { 
                System.out.println("Agência Correta");
                break;
            } else {
                System.out.println("Agência Incorreta. Tente novamente.");
            }
        }

        //Loop para validar o número da conta
        while (true) {
            System.out.println("Por favor, digite o número da conta:");
            Usuario = scanner.nextInt();

            if (Usuario == 1021) {
                System.out.println("Conta Correta");
                break; 
            } else {
                System.out.println("Conta Incorreta. Tente novamente.");
            }
        }

        // Exibe a mensagem final fora do loop
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + Agencia + ", conta " + Usuario + " e seu saldo é R$ " + Saldo + ". Já está disponível para saque.");

        scanner.close();
    }
}
