
public class LeiteVaporizado extends BebidaDecorator{ //Concrete Decorator

	public LeiteVaporizado(Bebida bebida) {
		super(bebida);
	}
	
	@Override
	public double getCusto() {
		return super.getCusto() + 1.20;
	}

	@Override
	public String getDescricao() {
		return super.getDescricao() + "Leite Vaporizado";
	}
}
