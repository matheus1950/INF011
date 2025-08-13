
public class Esqueleto implements Inimigo{
	private String arma;
	private boolean escudo;
	
	
	public Esqueleto(String arma, boolean escudo) {
		super();
		this.arma = arma;
		this.escudo = escudo;
	}


	public Esqueleto clone() {
		return new Esqueleto(this.arma, this.escudo);
	}


	public String getArma() {
		return arma;
	}


	public void setArma(String arma) {
		this.arma = arma;
	}


	public boolean isEscudo() {
		return escudo;
	}


	public void setEscudo(boolean escudo) {
		this.escudo = escudo;
	}


	@Override
	public String toString() {
		return "Esqueleto [arma=" + arma + ", escudo=" + escudo + "]";
	}
	
}