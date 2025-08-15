public class ChaVerde extends Bebida{//concrete component
	public ChaVerde() {
		super();
	}

	@Override
	public String getDescricao() {
		return "Chá Verde";
	}

	@Override
	public double getCusto() {
		return 3.80;
	}		
}