
public class Application {
	private UIComponentFactory factory;

	public Application(UIComponentFactory factory) {
		super();
		this.factory = factory;
	}

	public void setFactory(UIComponentFactory factory) {
		this.factory = factory;
	}

	public void renderUI() {
		System.out.println(factory.criarBotao().render());
		System.out.println(factory.criarMenu().render());
		System.out.println(factory.criarTextBox().render());
	}
}
