
public class Goblin implements Inimigo{
	private boolean armadura;

	public Goblin(boolean armadura) {
		super();
		this.armadura = armadura;
	}
	
	public Goblin clone() {
        return new Goblin(this.armadura);
    }

	public boolean isArmadura() { //necessário para pegar nas classes que herdam
		return armadura;
	}

	public void setArmadura(boolean armadura) {
		this.armadura = armadura;
	}

	@Override
	public String toString() {
		return "Goblin [armadura=" + armadura + "]";
	}

}
