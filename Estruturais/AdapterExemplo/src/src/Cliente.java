package src;

public class Cliente { //Client
	public static void main(String[] args) {
		ServicoCartaoCredito credito = new ServicoCartaoCredito();
		Pagamento cartao = new ServicoCartaoCreditoAdapter(credito);
		
		cartao.pagar(10);
	}
}
