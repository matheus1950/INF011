import java.util.ArrayList;
import java.util.List;

public class PizzaBuilder{
	private String tamanho;
	private String tipoDeMassa;
	//opcionais abaixo
	private boolean queijoExtra	= false;
	private String molho = null;
	private List<String> toppings = new ArrayList<>();

	public PizzaBuilder(String tamanho, String tipo) {
		this.tamanho = tamanho;
		this.tipoDeMassa = tipo;
	}

	public PizzaBuilder addQueijoExtra() {
		this.setQueijoExtra(true);
		return this;
	}
	
	public PizzaBuilder comMolho(String molho) {
		this.setMolho(molho);
		return this;
	}
	
	public PizzaBuilder adicionarTopping(String topping) {
		this.addToppings(topping);
		return this;
	}
	
	public Pizza build() {
		return new Pizza(this.tamanho, this.tipoDeMassa, this.queijoExtra, this.molho, this.toppings);
	}
	
	private void addToppings(String topping) {
		this.toppings.add(topping);
	}

	private void setQueijoExtra(boolean queijoExtra) {
		this.queijoExtra = queijoExtra;
	}

	private void setMolho(String molho) {
		this.molho = molho;
	}
	
}
