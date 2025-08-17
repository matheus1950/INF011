
public class MensagemUrgente extends Mensagem{ //Refined Abstractions

	@Override
	public void enviar(String destino, String conteudo) {
		System.out.println("[URGENTE]");
		this.getTipo().mensagem(destino, conteudo);
	}

}
