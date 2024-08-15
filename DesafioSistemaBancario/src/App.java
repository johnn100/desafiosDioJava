import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite seu nome: ");
            String nomeCliente = scanner.nextLine();
            
            System.out.println("Qual o tipo de conta (1 - CC / 2 - PP): ");
            int tipoConta = scanner.nextInt();

            Conta cc = null;
            Conta pp = null;

            if (tipoConta == 1) {
                cc = new ContaCorrente();
            }else{
                pp = new ContaPoupanca();
            }

            int tipoOp = 0;

            System.out.println("Digite a Operação (1 - Depósito / 2 - Saque / 3 - Transferência / 4 - Extrato / 5 - Sair): ");
            tipoOp = scanner.nextInt();

            while (tipoOp != 5) { 
                if (tipoOp == 1) {
                    System.out.println("Qual valor deseja depositar: ");
                    int valorDeposito = scanner.nextInt();
                    cc.depositar(valorDeposito);
                } else if (tipoOp == 2) {
                    System.out.println("Qual valor deseja sacar: ");
                    int valorSaque = scanner.nextInt();
                    cc.sacar(valorSaque);
                } else if (tipoOp == 3) {
                    System.out.println("Qual valor deseja transferir: ");
                    int valorTransferencia = scanner.nextInt();
                    Conta contaDestino = new ContaPoupanca();
                    cc.transferir(valorTransferencia, contaDestino);
                } else if (tipoOp == 4) {
                    if (tipoConta == 1) {
                        System.out.println("Olá " + nomeCliente);
                        cc.imprimirExtrato();
                    }else {
                        pp.imprimirExtrato();
                    }
                } else {
                    System.out.println("Opção inválida.");
                }

                System.out.println("Digite a Operação (1 - Depósito / 2 - Saque / 3 - Transferência / 4 - Extrato / 5 - Sair): ");
                tipoOp = scanner.nextInt();
            }
        }

        System.out.println("Operação finalizada.");

       
   }
}


