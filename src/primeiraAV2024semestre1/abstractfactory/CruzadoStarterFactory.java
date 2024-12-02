package primeiraAV2024semestre1.abstractfactory;

import primeiraAV2024semestre1.builder.CruzadoBuilder;
import primeiraAV2024semestre1.builder.EspadaBuilder;

public class CruzadoStarterFactory {
	
	public EspadaBuilder getEspada() {
		EspadaBuilder espada = new EspadaBuilder();
		espada.build();
		return espada;
	}
	
	public CruzadoBuilder getCruzado() {
		return new CruzadoBuilder();
	}
}
