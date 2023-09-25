import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       
        // Criando projeto Conta Banco
        
        Scanner ContaTerminal = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta");
        int número = ContaTerminal.nextInt();

        System.out.println("Por favor, digite o número da Agência");
        String agencia = ContaTerminal.next();

        System.out.println("Por favor, Digite seu Nome");
        String nome = ContaTerminal.next();

        System.out.println("Saldo atual");
        double saldo = ContaTerminal.nextDouble();
    }

    @Override
    public String toString() {
        return "ContaTerminal []";
    }
}
