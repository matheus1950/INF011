public class BebidaDecorator extends Bebida{ //Decorator
	private Bebida bebida;

	public BebidaDecorator(Bebida bebida) {
		super();
		this.bebida = bebida;
	}

	public String getDescricao() {
		return bebida.getDescricao();
	}
	
	public double getCusto() {
		return bebida.getCusto();
	}
}
