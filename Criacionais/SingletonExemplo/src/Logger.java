import java.util.ArrayList;

public class Logger {
	private static Logger logger;
	private final ArrayList<String> listaLogs = new ArrayList<String>();
	
	private Logger() {
	}
	
	public static Logger getInstance() {
		if(logger == null) {
			return logger = new Logger();
		}
		return logger;
	}
	
	public void log(String mensagem) {
		listaLogs.add(mensagem);
	}
	
	public ArrayList<String> exibirLogs() {
		return new ArrayList<String>(this.listaLogs);
	}

	@Override
	public String toString() {
		return "Logger [logs=" + listaLogs + "]";
	}
	
}
