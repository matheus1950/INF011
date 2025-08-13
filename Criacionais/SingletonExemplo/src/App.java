
public class App {

	public static void main(String[] args) {
		Logger log1 = Logger.getInstance();
		Logger log2 = Logger.getInstance();
		
		log1.log("Teste 1");
		log1.log("Funcionando");
		log2.log("Teste 2");
		
		System.out.println("------log 1 ---------");
		for(String log : log1.exibirLogs()) {
			System.out.println(log);
		}
		System.out.println("------log 2 ---------");
		for(String log : log2.exibirLogs()) {
			System.out.println(log);
		}
		
		System.out.println(Logger.getInstance());
		System.out.println(Logger.getInstance());
	}

}
