
public abstract class Arvore { //Flyweight
	private TipoArvore tipo;
	private String textura;
	private String cor;

	public abstract void desenhar(int x, int y);
	
	public Arvore(TipoArvore tipo, String caminho, String cor) {
		super();
		this.tipo = tipo;
		this.textura = caminho;
		this.cor = cor;
	}
}
