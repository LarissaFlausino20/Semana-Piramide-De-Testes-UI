package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	private By nome = By.id("nome");
	private By email = By.id("email");
	private By msg = By.id("msg");
	private By btnEnviar = By.cssSelector("a[href*='e2etreinamentos']");
	
	
	public By getNome() {
		return nome;
	}
	public By getEmail() {
		return email;
	}
	public By getMsg() {
		return msg;
	}
	public By getBtnEnviar() {
		return btnEnviar;
	}


}