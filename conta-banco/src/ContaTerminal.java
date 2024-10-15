import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        // Importando o Scanner
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // Definindo as variáveis
        int numero;
        String agencia;
        String NomeCliente;
        double saldo;

        // Perguntas que vão ser exibidas para o Usuário
        System.out.println("Por favor, digite o numero da Conta!");
        numero = sc.nextInt();
        sc.nextLine();      

        System.out.println("Por favor, digite o numero da Agência!");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome referente a conta!");
        NomeCliente = sc.nextLine();

        System.out.println("Por favor, insira seu saldo!");
        saldo = sc.nextDouble();

        // Mensagem final
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
