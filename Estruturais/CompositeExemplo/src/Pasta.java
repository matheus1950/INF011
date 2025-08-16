import java.util.ArrayList;
import java.util.List;

public class Pasta extends Item{ //Composite
	private List<Item> subpasta;
	
	public Pasta(String nome) {
		super(nome);
		this.subpasta = new ArrayList<>();
	}
	
	public void adicionar(Item item) {
		subpasta.add(item);
	}

	@Override
	public int getTamanho() {
		int tamanho = 0;
		for(Item item : subpasta) {
			tamanho += item.getTamanho();
		}
		return tamanho;
	}

	@Override
	public String getNome() {
		return "Pasta " + super.getNome();
	}

}
