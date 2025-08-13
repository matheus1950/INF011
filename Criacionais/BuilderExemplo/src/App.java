
public class App {

	public static void main(String[] args) {
		
		Pizza pizza = new PizzaBuilder("G", "tradicional")
				.addQueijoExtra() 						
			    .comMolho("picante")  
			    .adicionarTopping("bacon")  
			    .build();
		
		System.out.println(pizza);
	}

}