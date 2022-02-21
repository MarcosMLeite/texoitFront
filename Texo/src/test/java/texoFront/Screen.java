package texoFront;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Screen {
	public Screen(WebDriver driver) {

		PageFactory.initElements(driver, this);
		}
	
	
	@FindBy(xpath = "//a[contains(text(),'Guide')]")
	public WebElement btnMenu;
	
	@FindBy(xpath = "//a[contains(text(),'/albums/1/photos')]")
	public WebElement btnAlbum;
	
	@FindBy(xpath = "body > pre")
	public WebElement btnTitle;
	
	@FindBy(xpath = "/html/body/pre")
	public WebElement btnJason;

	
}
