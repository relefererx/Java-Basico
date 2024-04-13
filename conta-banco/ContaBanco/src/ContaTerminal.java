import java.util.Locale;
import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia, nomeCliente;
        double saldo = new Double(0.00);

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.next();
        
        System.out.println("Por favor, digite o número da Conta!");
        numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o saldo!");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
            + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );
        
    }
}