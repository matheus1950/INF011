import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory { //Flyweight Factory
	private Map<TipoArvore, Arvore> arvoreCache = new HashMap<>();
	
	public Arvore getArvore(TipoArvore tipo) {
		if(arvoreCache.containsKey(tipo)) {
			return arvoreCache.get(tipo);
		}
		else {
			Arvore arvore;
			if(tipo.equals(TipoArvore.CARVALHO)) {
				arvore = new ArvoreFlyweight(tipo, "docs/texturaCarvalho.img", "avermelhado");				
			}
			else if(tipo.equals(TipoArvore.IPÊ)) {
				arvore = new ArvoreFlyweight(tipo, "docs/texturaIpê.img", "marrom claro");				
			}
			else if(tipo.equals(TipoArvore.PINHEIRO)) {
				arvore = new ArvoreFlyweight(tipo, "docs/texturaPinheiro.img", "marrom escuro");				
			}
			else {
				throw new IllegalArgumentException("Tipo de árvore não conhecido!");
			}
			arvoreCache.put(tipo, arvore);
			return arvore;
		}
	}
	
	public int contagem() {
		return arvoreCache.size();
	}
	
}
