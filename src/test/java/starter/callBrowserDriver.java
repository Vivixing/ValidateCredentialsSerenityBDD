package starter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class callBrowserDriver {
    public WebDriver startApplication(String browser, String baseURL, WebDriver driver)
    
    {

        if(browser.equals("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(browser.equals("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else
        {
            System.out.println("We do not support this browser");
        }
        driver.manage().window().maximize();
        driver.get(baseURL);
        return driver;
    }
}
