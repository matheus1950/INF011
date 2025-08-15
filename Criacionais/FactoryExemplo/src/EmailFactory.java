
public class EmailFactory implements NotificacaoFactory{

	@Override
	public Notificacao criar_notificacao(String mensagem) {
		return new Email(mensagem);
	}
	
}
