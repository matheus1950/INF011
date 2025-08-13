
public class App {

	public static void main(String[] args) {
		GoblinMago mago = new GoblinMago(false, true); //armadura - cajado
		GoblinMago mago2 = mago.clone();
		
		System.out.println("primeiro mago" + mago.toString());
		System.out.println("segundo mago" + mago2.toString());
		
		mago2.setArmadura(true);
		mago2.setCajado(false);
		
		System.out.println("---------------------Teste 2---------------------------------");
		System.out.println("primeiro mago" + mago.toString());
		System.out.println("segundo mago" + mago2.toString());
	}

}
