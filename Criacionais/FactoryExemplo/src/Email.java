
public class Email implements Notificacao{
	String mensagem;
	
	
	public Email(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	@Override
	public void enviar() {
		System.out.println("Email " + this.mensagem);	
	}
}
