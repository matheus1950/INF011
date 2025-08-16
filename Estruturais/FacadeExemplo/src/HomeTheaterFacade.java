
public class HomeTheaterFacade {	//Facade
	private Luz luz;
	private Tela tela;
	private Projetor projetor;
	private Amplificador ampli;
	private PlayerBluRay playerBluRay;
	private ArCondicionado ar;
	
	

	public HomeTheaterFacade() {
		super();
		this.luz = new Luz();
		this.tela = new Tela();
		this.projetor = new Projetor();
		this.ampli = new Amplificador();
		this.playerBluRay = new PlayerBluRay();
		this.ar = new ArCondicionado();
	}

	public void assistirFilme(String titulo) {
		luz.setIntensidade(10);
		tela.descer();
		projetor.ligar();
		projetor.setModoWide();
		ampli.ligar();
		ampli.setEntrada(playerBluRay);
		ampli.setVolume(5);
		playerBluRay.ligar();
		playerBluRay.play(titulo);
		ar.ligar();
		ar.setTemperatura(22);
		System.out.println("Sessão iniciada");
	}
	
	public void encerrarFilme() {
		luz.setIntensidade(0);
		tela.subir();
		projetor.desligar();
		ampli.desligar();
		playerBluRay.desligar();
		ar.desligar();
		System.out.println("Sessão encerrada");

	}
}
