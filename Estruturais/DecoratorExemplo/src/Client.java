
public class Client { //Client

	public static void main(String[] args) {
		//Espresso
		Bebida bebida = new Espresso();
		bebida = new LeiteVaporizado(bebida);
		bebida = new Chocolate(bebida);
		bebida = new Chocolate(bebida);
		System.out.println("Valor do espresso: " + bebida.getCusto());
		System.out.println(bebida.getDescricao());
		
		//Chá Verde
		Bebida cha = new ChaVerde();
		cha = new Chantilly(cha);
		System.out.println("Valor do chá: " + cha.getCusto());
		System.out.println(cha.getDescricao());
	}

}
