
public abstract class Item { //Component
	private String nome;
	
	public Item(String nome) {
		super();
		this.nome = nome;
	}
	
	public abstract int getTamanho();
	
	public String getNome() {
		return this.nome;
	}
}
