
public class Cliente { //Client

	public static void main(String[] args) {
		Pasta pastaRaiz = new Pasta("Meus Documentos");
		Arquivo arquivo1 = new Arquivo("Curriculo.pdf", 120);
		Arquivo arquivo2 = new Arquivo("Foto.jpg", 3000);
		Pasta subpasta = new Pasta("Projetos");

		Arquivo projeto1 = new Arquivo("App.java", 45);
		Arquivo projeto2 = new Arquivo("BancoDeDados.sql", 80);

		subpasta.adicionar(projeto1);
		subpasta.adicionar(projeto2);

		pastaRaiz.adicionar(arquivo1);
		pastaRaiz.adicionar(arquivo2);
		pastaRaiz.adicionar(subpasta);

		System.out.println("Tamanho total: " + pastaRaiz.getTamanho() + " KB");
		
		System.out.println("Nomes da pastaRaiz: " + pastaRaiz.getNome());
		System.out.println("Nomes do arquivo1: " + arquivo1.getNome());

	}

}
