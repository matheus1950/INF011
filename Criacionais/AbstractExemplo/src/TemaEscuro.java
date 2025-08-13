
public class TemaEscuro extends UIComponentFactory{

	@Override
	public Botao criarBotao() {
		return new BotaoEscuro();	
	}

	@Override
	public Menu criarMenu() {
		return new MenuEscuro();	
	}

	@Override
	public TextBox criarTextBox() {
		return new TextBoxEscuro();	
	}

}
