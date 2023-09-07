import java.util.Calendar;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY);

        String saudacao = "";

        if (hora >= 6 && hora < 12) {
            saudacao = "Bom dia";
        } else if (hora >= 12 && hora < 18) {
            saudacao = "Boa tarde";
        } else if (hora >= 18 && hora <= 6) {
            saudacao = "Boa noite";
        }

        System.out.println(saudacao + " para começarmos, por favor me informe o seu nome: ");
        String nome = scanner.next();

        System.out.println("Agora me informe o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Agora me informe o número da agencia: ");
        String numeroAgencia = scanner.next();

        System.out.println("Para finalizar, quanto deseja depositar em sua conta? ");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia é" + numeroAgencia +
                        ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
