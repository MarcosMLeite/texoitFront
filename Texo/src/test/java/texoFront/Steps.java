package texoFront;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps extends Action{
	
	Screen el = new Screen(driver);
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String arg1) throws Throwable {
	  abrirNavegador(arg1);
	}

	@Given("^clicar no menu$")
	public void clicar_no_menu() throws Throwable {
		esperarElemento(el.btnMenu);
		el.btnMenu.click();
		
	
	}

	@When("^clicar na aba album$")
	public void clicar_na_aba_album() throws Throwable {
		
		Scroll();
		wait.until(ExpectedConditions.visibilityOf(el.btnAlbum));
		el.btnAlbum.click();
	 
	}

	@Then("^valido id desejado\\.$")
	public void valido_id_desejado() throws Throwable {
		screenShot("accusamus ea aliquid et amet sequi nemo");
		esperarElemento(el.btnJason);
		ValidarId(el.btnJason, "accusamus ea aliquid et amet sequi nemo");
	    fecharBrowser();
	}
}
