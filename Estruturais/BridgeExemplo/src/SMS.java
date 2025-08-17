
public class SMS implements TipoMensagem{ //Concrete Implementors

	@Override
	public void mensagem(String destino, String conteudo) {
		System.out.println("PARA: " + destino);
		System.out.println(conteudo);
		System.out.println("Essa é uma mensagem de SMS!");	
	}

}
