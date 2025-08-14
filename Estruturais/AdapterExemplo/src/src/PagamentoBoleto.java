package src;

public class PagamentoBoleto implements Pagamento { //ConcreteService
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " via boleto.");
    }
}
