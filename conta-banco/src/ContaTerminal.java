import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Exibir as mensagens para o nosso usuário
        System.out.println("Digite o numero da conta: ");
        int contaNumero = scanner.nextInt();

        System.out.println("Digite a age1021ncia: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o saldo em conta: ");
        double saldo = scanner.nextDouble();

        // Obter pela scanner os valores digitados no terminal
        System.out.println("Conta Corrente: " + contaNumero);
        System.out.println("Agencia: " + agencia);
        System.out.println("Nome do Cliente: " + nomeCliente);
        System.out.println("Saldo (R$): " + saldo);


        // Exibir a mensagem da conta criada


    }
}
