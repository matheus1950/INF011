
public abstract class Mensagem { //Abstraction
	private TipoMensagem tipo;
    public abstract void enviar(String destino, String conteudo);
    
	public TipoMensagem getTipo() {
		return tipo;
	}
	public void setTipo(TipoMensagem tipo) {
		this.tipo = tipo;
	}
}
