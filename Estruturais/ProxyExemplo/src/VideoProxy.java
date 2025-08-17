
public class VideoProxy implements Video{ //Proxy
	private VideoReal real;
	private String nome;
	private String caminho;

	public VideoProxy(String nome, String caminho) {
		super();
		this.nome = nome;
		this.caminho = caminho;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public void exibirImagemMiniatura() {
		if(real == null)
			real = new VideoReal(nome, caminho);
		real.exibirImagemMiniatura();
	}
	
	@Override
	public void reproduzir() {
		if(real == null)
			real = new VideoReal(nome, caminho);
		real.reproduzir();		
	}
}
