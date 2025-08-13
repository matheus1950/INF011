
public class PushNotification implements Notificacao{
	String mensagem;
	
	
	public PushNotification(String mensagem) {
		super();
		this.mensagem = mensagem;
	}

	@Override
	public void enviar() {
		System.out.println("PushNotification " + this.mensagem);		
	}

}
