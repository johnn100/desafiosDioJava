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

        System.out.println("Deseja realizar saque? ");
        int realizarSaque = scanner.nextInt();

        if(realizarSaque == 1){
            System.out.println("Digite o valor do saque: ");
            Double saque = scanner.nextDouble();

            double saldoAtual = saldo - saque;

                if(saque <= saldo){
                    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " e está realizando um saque de R$ " + saque + " ficando um saldo na conta de R$ " + saldoAtual);
                }else{
                    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " e está realizando um saque de R$ " + saque + " mas está sem saldo no momento");
                }

        } else {
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$ " + saldo + " e está disponível para saque.");
        }
    }
}
