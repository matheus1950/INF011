
public class VideoReal implements Video{ //Service
	private String nome;
	private String caminho;
	private static int instancias = 0;

	public VideoReal(String nome, String caminho) {
		super();
		this.nome = nome;
		this.caminho = caminho;
		instancias++;
	}

	public String getNome() {
		return this.nome;
	}

	public void exibirImagemMiniatura() {
		System.out.println("exibindo");
	}

	public void reproduzir() {
		System.out.println("reproduzindo " + this.nome);
	}

	public static int getInstancias() {
		return instancias;
	}
}
