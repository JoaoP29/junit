import modelo.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaTeste {
    @Test
    @DisplayName("Depositar com conta ativa")
    public void deveDepositarComContaAtiva(){
        Conta conta = new Conta();

        Assertions.assertTrue(conta.ativar());
        Assertions.assertTrue(conta.depositar(100.00));
        Assertions.assertEquals(100.00, conta.getSaldo());
    }

    @Test
    @DisplayName("Saca dinheiro")
    public void sacaDinheiro(){
        Conta conta = new Conta();

        Assertions.assertTrue(conta.ativar());
        Assertions.assertTrue(conta.depositar(1000.00));

        Assertions.assertTrue(conta.sacar(1000.00));
        Assertions.assertEquals(0.00, conta.getSaldo());
    }

    @Test
    @DisplayName("Não pode depositar com conta inativa")
    public void naoDeveDepositarDeContaInativa(){
        Conta conta = new Conta();

        Assertions.assertFalse(conta.depositar(150.00));
    }

    @Test
    @DisplayName("Não pode sacar dinheiro de conta inativa")
    public void naoDeveSacarDinheiroDeContaInativa(){
        Conta conta = new Conta();

        Assertions.assertTrue(conta.ativar());
        Assertions.assertTrue(conta.depositar(1000.00));

        Assertions.assertFalse(conta.inativar());
        Assertions.assertFalse(conta.sacar(1000.00));
    }
}
