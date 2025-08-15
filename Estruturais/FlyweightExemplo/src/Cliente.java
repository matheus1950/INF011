import java.util.Map;
import java.util.Random;

public class Cliente { //Client

	public static void main(String[] args) {
		ArvoreFactory factory = new ArvoreFactory();
		
		Arvore carvalho = factory.getArvore(TipoArvore.CARVALHO);	
		carvalho.desenhar(100, 250);
		
		Arvore ipe = factory.getArvore(TipoArvore.IPÊ);	
		ipe.desenhar(2, 20);
		
		Arvore novoIpe = factory.getArvore(TipoArvore.IPÊ);	
		novoIpe.desenhar(3, 50);
		
		
		Random rnd = new Random();

	    for (int i = 0; i < 1_000_000; i++) {
	        TipoArvore tipoRand = TipoArvore.values()[rnd.nextInt(3)];
	        int x = rnd.nextInt(10_000);
	        int y = rnd.nextInt(10_000);
	        factory.getArvore(tipoRand).desenhar(x, y);
	    }
	    System.out.println("Instâncias únicas: " + factory.contagem());	
	}

}
