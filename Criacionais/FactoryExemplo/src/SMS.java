
public class SMS implements Notificacao{
	String mensagem;
	
	public SMS(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	@Override
	public void enviar() {
		System.out.println("SMS " + this.mensagem);		
	}

}
