
public class PushNotificationFactory implements NotificacaoFactory{

	@Override
	public Notificacao criar_notificacao(String mensagem) {
		return new PushNotification(mensagem);
	}

}
