
public class Arquivo extends Item{ //Leaf
	
	private int tamanho;

	public Arquivo(String nome, int tamanho) {
		super(nome);
		this.tamanho = tamanho;
	}

	@Override
	public int getTamanho() {
		return this.tamanho;
	}

	@Override
	public String getNome() {
		return "Arquivo " + super.getNome();
	}
}
