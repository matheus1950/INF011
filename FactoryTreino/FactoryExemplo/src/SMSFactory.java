
public class SMSFactory implements NotificacaoFactory{

	@Override
	public Notificacao criar_notificacao(String mensagem) {
		return new SMS(mensagem);
	}

}
