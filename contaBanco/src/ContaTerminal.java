import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Digite o saldo: ");
        Double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
        
    }
}
