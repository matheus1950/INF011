
public class ArvoreFlyweight extends Arvore{ //Concrete Flyweight
	public ArvoreFlyweight(TipoArvore tipo, String caminho, String cor) {
		super(tipo, caminho, cor);
	}
	public void desenhar(int x, int y) {
		System.out.println("Desenhado em x = "  + x + " e y = " + y); //lógica abstraida
	}
}
