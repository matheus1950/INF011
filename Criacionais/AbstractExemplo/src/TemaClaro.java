
public class TemaClaro extends UIComponentFactory{

	@Override
	public Botao criarBotao() {
		return new BotaoClaro();
	}

	@Override
	public Menu criarMenu() {
		return new MenuClaro();
		
	}

	@Override
	public TextBox criarTextBox() {
		return new TextBoxClaro();	
	}

}
