import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnaylamaSayfasi {
    WebDriver driver;

    By x = By.xpath("//*[@id=\"close\"]");
    By tic = By.xpath("/html/body/div[5]/div/form/div[1]/div[4]/div[1]/label");
    By paynow = By.xpath("/html/body/div[5]/div/form/div[1]/div[6]/input[2]");


    public OnaylamaSayfasi(WebDriver driver)
    {
        this.driver = driver;
    }


    public void pressX()
    {
        driver.findElement(x).click();
    }
    public void markBox()
    {
        driver.findElement(tic).click();
    }
    public void pressButton()
    {
        driver.findElement(paynow).click();
    }
}
