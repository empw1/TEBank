import java.util.Scanner;

public class ContaCorrente {
    private String nome;
    private int conta, saques;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    public ContaCorrente(String nome, int conta, double saldoInicial){
        this.nome = nome;
        this.conta = conta;
        saldo = saldoInicial;
        saques = 0;
    }

    public void extrato(){
        System.out.println("\tEXTRATO");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número da conta: " + this.conta);
        System.out.printf("Saldo atual: %.2f\n", this.saldo);
        System.out.println("Saques realizados hoje: " + this.saques + "\n");
    }

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            saques++;
            System.out.println("Valor sacado: " + valor);
            System.out.println("Novo saldo: " + saldo + "\n");
        }else {
            System.out.println("Saldo Insuficiente, Faça um novo depósito\n");
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depositando: " + valor);
        System.out.println("Novo saldo: " + saldo + "\n");
    }
}
