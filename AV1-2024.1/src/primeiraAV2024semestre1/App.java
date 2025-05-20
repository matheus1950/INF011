
public class App {

	public static void main(String[] args) {
		
		CruzadoStarterFactory cruzadostarter = new CruzadoStarterFactory();
		
		CruzadoBuilder cruzadoB = cruzadostarter.getCruzado();
		
		EspadaBuilder espadaB = cruzadostarter.getEspada();
		
		cruzadoB.addArma(espadaB.build());
		
		System.out.println(cruzadoB);

	}

}
