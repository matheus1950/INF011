package primeiraAV2024semestre1;

import primeiraAV2024semestre1.abstractfactory.CruzadoStarterFactory;
import primeiraAV2024semestre1.builder.CruzadoBuilder;

public class Programa {
	
	
	CruzadoStarterFactory cruzadostarter = new CruzadoStarterFactory();
	
	CruzadoBuilder cruzadoB = cruzadostarter.getCruzado();
	
	cruzadoB.addArma(cruzadostarter.getEspada());
}
