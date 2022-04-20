import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ContaCorrenteTeste{

    private String nome = "Ricardo";
    private int conta = 8989;
    private double saldoInicial = 1000.0d;
    private double saldoZerado = 0;

    @Test
    public void deveAdicionarSaldoEVerificarValorFinal(){
        ContaCorrente contaTeste = new ContaCorrente(nome, conta, saldoInicial);

        contaTeste.depositar(1345.0d);

        Assertions.assertEquals(2345.0d, contaTeste.getSaldo());
    }

    @Test
    public void deveRealizarSaqueEVerificarValorFinal(){
        ContaCorrente contaTeste = new ContaCorrente(nome, conta, saldoInicial);

        contaTeste.sacar(300.0d);

        Assertions.assertEquals(700.0d, contaTeste.getSaldo());
    }

    @Test
    public void deveRealizarSaqueComSaldoZeroEVerificarSeSaldoPermaneceIgual(){
        ContaCorrente contaTeste = new ContaCorrente(nome, conta, saldoZerado);

        contaTeste.sacar(100.0d);

        Assertions.assertEquals(0.0d, contaTeste.getSaldo());
    }
}
