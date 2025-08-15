public class Espresso extends Bebida {//concrete component

	public Espresso() {
		super();
	}

	@Override
	public String getDescricao() {
		return "Café Espresso";
	}

	@Override
	public double getCusto() {
		return 4.50;
	}	
	
}