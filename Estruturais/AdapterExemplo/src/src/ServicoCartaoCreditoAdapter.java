package src;

public class ServicoCartaoCreditoAdapter implements Pagamento{ //Adapter
	ServicoCartaoCredito credito;
	
	public ServicoCartaoCreditoAdapter(ServicoCartaoCredito credito) {
		super();
		this.credito = credito;
	}
	
	@Override
	public void pagar(double valor) {
		credito.processarPagamentoCartao(valor);
	}

}
