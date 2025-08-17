
public class MensagemSimples extends Mensagem{ //Refined Abstractions

	@Override
	public void enviar(String destino, String conteudo) {
		this.getTipo().mensagem(destino, conteudo);
	}
}
