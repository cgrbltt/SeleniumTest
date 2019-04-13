import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class KartBilgileri {

    WebDriver driver;

    By KartAdi = By.xpath("//*[@id=\"Ecom_Payment_Card_Name\"]");
    By KartNumarasi = By.xpath("//*[@id=\"Ecom_Payment_Card_Number\"]");
    By Exmm = By.xpath("//*[@id=\"Ecom_Payment_Card_ExpDate_Month\"]");
    By Exyy = By.xpath("//*[@id=\"Ecom_Payment_Card_ExpDate_Year\"]");
    By OnayKodu = By.xpath("//*[@id=\"Ecom_Payment_Card_Verification\"]");
    By Confirm = By.xpath("//*[@id=\"submit3\"]");

    public KartBilgileri(WebDriver driver)
    {
        this.driver = driver;
    }


    public void KartAdi(String KA)
    {
        driver.findElement(KartAdi).sendKeys(KA);
    }
    public void KartNumarasi(String KN)
    {
        driver.findElement(KartNumarasi).sendKeys(KN);
    }
    public void Exmm(String numara)
    {
        Select selectm = new Select (driver.findElement(Exmm));
        selectm.selectByVisibleText(numara);
    }
    public void Exyy(String numara)
    {
        Select selecty = new Select (driver.findElement(Exyy));
        selecty.selectByVisibleText(numara);
    }
    public void OnayKodu(String OK)
    {
        driver.findElement(OnayKodu).sendKeys(OK);
    }
    public void Confirm()
    {
        driver.findElement(Confirm).click();
    }
}
