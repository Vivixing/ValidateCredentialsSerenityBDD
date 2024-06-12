package starter;

import net.serenitybdd.core.pages.PageObject;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import static org.assertj.core.api.Assertions.assertThat;


public class LoginPageTest extends PageObject {

    WebDriver driver;
    callBrowserDriver callBrowserDriver = new callBrowserDriver();
    
    @Test
    public void shouldLoginWithValidCredentials() {
        driver = callBrowserDriver.startApplication("chrome", "https://campus.usbco.edu.co/psp/USCS90PR/?cmd=login&languageCd=ESP&",this.driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginCheck("user", "123");
       
        // Aserción para verificar que se haya iniciado sesión correctamente
        assertThat(driver.getCurrentUrl()).isEqualTo("https://campus.usbco.edu.co/psp/USCS90PR/EMPLOYEE/HRMS/h/?tab=DEFAULT"); 
    }
    @Test
    public void shouldFailLoginWithInvalidCredentials() {

        driver = callBrowserDriver.startApplication("chrome", "https://campus.usbco.edu.co/psp/USCS90PR/?cmd=login&languageCd=ESP&",this.driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginCheck("user", "123");
        

        // Añadir aserciones para verificar que el inicio de sesión falló
        assertThat(driver.getCurrentUrl()).isEqualTo("https://campus.usbco.edu.co/psp/USCS90PR/?&cmd=login&errorCode=105&languageCd=ESP"); 

    }

}

