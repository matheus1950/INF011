
public class GoblinMago extends Goblin{
	
	private boolean cajado;

	public GoblinMago(boolean armadura, boolean cajado) {
		super(armadura);
		this.cajado = cajado;
	}
	
	public GoblinMago clone() {
		return new GoblinMago(this.isArmadura(), this.cajado);
	}

	public boolean isCajado() {
		return cajado;
	}

	public void setCajado(boolean cajado) {
		this.cajado = cajado;
	}

	@Override
	public String toString() {
		return "GoblinMago [cajado=" + cajado + ", isArmadura()=" + isArmadura() + "]";
	}
}
