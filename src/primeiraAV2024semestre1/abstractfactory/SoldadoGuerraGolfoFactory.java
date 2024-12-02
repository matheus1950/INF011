
public class SoldadoGuerraGolfoFactory {
	public MetralhadoraBuilder getMetralhadora() {
		MetralhadoraBuilder metralhadora = new MetralhadoraBuilder();
		metralhadora.reset();
		metralhadora.habilitar();
		return metralhadora;
	}
	
	public SoldadoGuerraGolfoBuilder getSoldado() {
		SoldadoGuerraGolfoBuilder soldado = new SoldadoGuerraGolfoBuilder();
		soldado.reset();
		return soldado;
	}
}
