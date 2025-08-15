
public class Chantilly extends BebidaDecorator{ //Concrete Decorator

	public Chantilly(Bebida bebida) {
		super(bebida);
	}

	@Override
	public double getCusto() {
		return super.getCusto() + 1.00;
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + "Chantilly";
	}
}
