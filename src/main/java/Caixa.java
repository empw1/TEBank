import java.util.Random;
import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        String nome;
        double inicial;
        Scanner entrada = new Scanner(System.in);
        Random numero = new Random();
        int conta = 1 + numero.nextInt(9999);

        System.out.println("Cadastrando novo Cliente.");
        System.out.println("Entre com seu nome: ");
        nome = entrada.nextLine();

        System.out.println("Entre com valor inicial para depósito em conta: ");
        inicial = entrada.nextDouble();

        ContaCorrente minhaConta = new ContaCorrente(nome, conta, inicial);
        minhaConta.iniciar();
    }
}
