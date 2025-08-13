
public class App {

	public static void main(String[] args) {
		
		String tipo = null;
		NotificacaoFactory fabrica;
		String mensagem = null;
		
		tipo = "Email";
		mensagem = "Reunião marcada!";
		
		if(tipo.equals("Email")) {
			fabrica = new EmailFactory();
		}
		else if(tipo.equals("SMS")) {
			fabrica = new SMSFactory();
		}
		else if(tipo.equals("PushNotification")){
			fabrica = new PushNotificationFactory();
		}
		else {
			throw new IllegalArgumentException("Tipo invalido");
		}
		
		if(mensagem != null) {
			fabrica.criar_notificacao(mensagem).enviar();		
		}
		else {
			System.out.println("Sem mensagem!");
		}
		
	}

}
