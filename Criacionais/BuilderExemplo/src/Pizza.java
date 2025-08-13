import java.util.ArrayList;
import java.util.List;

public class Pizza {
	private final String tamanho;
	private final String tipoDeMassa;
	//opcionais abaixo
	private final boolean queijoExtra;
	private final String molho;
	private final List<String> toppings; //adicionais
	
	public String getTamanho() {
		return tamanho;
	}
	
	public String getTipoDeMassa() {
		return tipoDeMassa;
	}

	public Pizza(String tamanho, String tipoDeMassa, boolean queijoExtra, String molho, List<String> toppings) {
		super();
		this.tamanho = tamanho;
		this.tipoDeMassa = tipoDeMassa;
		this.queijoExtra = queijoExtra;
		this.molho = molho;
		this.toppings = toppings;
	}

	public boolean isQueijoExtra() {
		return queijoExtra;
	}

	public String getMolho() {
		return molho;
	}

	public List<String> getToppings() {
		return toppings;
	}

	@Override
	public String toString() {
		return "Pizza [tamanho=" + tamanho + ", tipoDeMassa=" + tipoDeMassa + ", queijoExtra=" + queijoExtra
				+ ", molho=" + molho + ", toppings=" + toppings + "]";
	}
}
