
public class SoldadoGuerraSecessaoBuilder {
	public BacamarteBuilder getBacamarte() {
		BacamarteBuilder bacamarte = new BacamarteBuilder();
		bacamarte.reset();
		bacamarte.habilitar();
		return bacamarte;
	}
	
	public SoldadoGuerraSecessaoBuilder getSoldadoGuerraSecessao() {
		return new SoldadoGuerraSecessaoBuilder();
	}
}
