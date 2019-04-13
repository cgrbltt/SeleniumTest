import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount {


    WebDriver driver;

    By name = By.xpath("/html/body/div[5]/div/form/div/div[2]/div[3]/input");
    By surname = By.xpath("/html/body/div[5]/div/form/div/div[2]/div[4]/input");
    By email = By.xpath("//*[@id=\"form-register\"]/div/div[2]/div[5]/input");
    By password = By.xpath("//*[@id=\"password\"]");
    By button = By.xpath("//*[@id=\"form-register\"]/div/div[2]/div[11]/input");

    public CreateAccount(WebDriver driver)
    {
        this.driver = driver;
    }

    public void typeName(String N)
    {
        driver.findElement(name).sendKeys(N);
    }


    public void typeSurname(String SN)
    {
        driver.findElement(surname).sendKeys(SN);
    }
    public void typeEmail(String EM)
    {
        driver.findElement(email).sendKeys(EM);
    }
    public void typePassword(String PS)
    {
        driver.findElement(password).sendKeys(PS);
    }
    public void button()
    {
        driver.findElement(button).click();
    }
}
