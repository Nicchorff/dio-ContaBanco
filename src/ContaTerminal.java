import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random rdm = new Random();
        System.out.println("Olá, insira seu Número: ");
        int numero = sc.nextInt();

        System.out.println("Insira sua Agência: ");
        var agencia = sc.next();

        System.out.println("Insira seu Primeiro Nome: ");
        var nome = sc.next();

        System.out.println("Insira seu Sobrenome: ");
        var sobrenome = sc.next();

        var saldo = rdm.nextDouble(10000);

        Banco banco  = new Banco(numero,agencia,saldo);


        System.out.println("Olá "+ banco.nomeCompleto(nome,sobrenome)+", obrigado por criar uma conta em nosso banco, sua agência é " + banco.agencia +
                "," + " conta "+ banco.numero+ " e seu saldo" + banco.saldo +"já está disponível para saque");

    }
}
