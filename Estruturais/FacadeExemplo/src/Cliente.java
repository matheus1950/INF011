
public class Cliente { //Client

	public static void main(String[] args) {
		HomeTheaterFacade home = new HomeTheaterFacade();
		home.assistirFilme("Inception");
		home.encerrarFilme();
	}

}
