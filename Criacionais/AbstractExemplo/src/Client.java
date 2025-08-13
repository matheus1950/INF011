
public class Client {

	public static void main(String[] args) {
		UIComponentFactory claro = new TemaClaro();
			
		System.out.println("1 - Criação do tema claro + renderização:");
		Application app = new Application(claro);
		app.renderUI();
		
		System.out.println("2 - Criação do tema escuro + renderização:");
		TemaEscuro escuro = new TemaEscuro();
		app.setFactory(escuro);
		app.renderUI();
	}

}
