
public class Chocolate extends BebidaDecorator{ //Concrete Decorator

	public Chocolate(Bebida bebida) {
		super(bebida);
	}
	
	@Override
	public double getCusto() {
		return super.getCusto() + 1.70;
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + "Chocolate";
	}

}
