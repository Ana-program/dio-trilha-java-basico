import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor digite o número da sua conta");
        numero = ler.nextInt();
        ler.nextLine();

        System.out.println("Por favor digite o número da sua agência com o digito");
        agencia = ler.nextLine();

        System.out.println("Por favor informe o seu nome completo");
        nomeCliente = ler.nextLine();

        System.out.println("Por favor informe o seu saldo");
        saldo = ler.nextDouble();

}
    }

