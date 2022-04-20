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

    public void iniciar(){
        int opcao;

        do{
           exibeMenu();
           opcao = entrada.nextInt();
           escolheOpcao(opcao);
        }while (opcao != 4);
    }

    public void exibeMenu(){
        System.out.println("\tEscolha a opção desejada");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair\n");
        System.out.println("Opção: ");
    }

    public void escolheOpcao(int opcao){
        double valor;

        switch (opcao){
            case 1:
                extrato();
                break;

            case 2:
                if (saques < 3){
                    System.out.println("Quanto deseja sacar: ");
                    valor = entrada.nextDouble();
                    sacar(valor);
                }else{
                    System.out.println("Limite de saques atingidos no dia.\n");
                }
                break;

            case 3:
                System.out.println("Quanto deseja depositar: ");
                valor = entrada.nextDouble();
                depositar(valor);
                break;

            case 4:
                System.out.println("Encerrando Atividade.");
                break;

            default:
                System.out.println("Opção inválida");
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
