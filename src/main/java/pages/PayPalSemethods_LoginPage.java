package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;
import wdMethods.SeMethods;

public class PayPalSemethods_LoginPage extends ProjectMethods {
	
	public PayPalSemethods_LoginPage() {		
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.ID,using="signup-button")
	private WebElement eleSignUp;
	@FindBy(how=How.ID,using="radio-personal")
	private WebElement radio;
	@FindBy(how=How.LINK_TEXT,using="Next")
	private WebElement nextButton;
	@FindBy(how=How.ID,using="country")
	private WebElement country;
	
	public PayPalSemethods_LoginPage paypalLogin(String data) {
		
		click(eleSignUp);
		verifySelected(radio);
		click(nextButton);	
		selectDropDownUsingText(country, data);
		/*WebElement email = locateElement("email");
		type(email,"l.nivedhanair@gmail.com");
	
		WebElement password = locateElement("password");
		type(password,"Nivedha@2018");
		
		WebElement reEnterpassword = locateElement("confirmPassword");
		type(reEnterpassword,"Nivedha@2018");
		*/
		//closeBrowser();
		return this;
	}

}
