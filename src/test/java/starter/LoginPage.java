package starter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.serenitybdd.core.pages.PageObject;


public class LoginPage extends PageObject{
    
    WebDriver driver;

    @FindBy(id = "userid")
    private WebElement userid;

    @FindBy(id = "pwd")
    private WebElement pwd;

    @FindBy(css = "input[type='submit'][value='Conectar']")
    private WebElement submit;

    public void loginCheck(String username, String password) {
        userid.sendKeys(username);
        pwd.sendKeys(password);
        submit.click();
    }

    //constructor
    public LoginPage(WebDriver driver) 
    {
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
}
