import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        // Exibir as mensagens para o nosso usuário
        System.out.println("Digite o número da conta: ");
        int contaNumero = scanner.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine().toUpperCase();
        nomeCliente += scanner.nextLine().toUpperCase();

        System.out.println("Digite o saldo em conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("");

        // Obter pela scanner os valores digitados no terminal
         System.out.println("Conta: "+contaNumero);
         System.out.println("Agência: "+agencia);
         System.out.println("Cliente: "+nomeCliente);
         System.out.println("Saldo(R$): "+saldo);

        System.out.println("");
        // Exibir a mensagem da conta criada
        System.out.println("Olá "+nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é: "+agencia+", conta: "+contaNumero+" e seu saldo de R$ "+saldo+",\n já está disponivel para saque.");
    }
}
