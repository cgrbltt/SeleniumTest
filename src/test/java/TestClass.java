import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class TestClass {


    public static void main(String[] args) throws InterruptedException {


        //Rastgele bir mail çekmek için bu siteyi ziyeret ediyoruz.
        WebDriver randommail = new FirefoxDriver();
        randommail.get("http://www.yopmail.com/en/email-generator.php");
        WebElement randommailElement = randommail.findElement(By.xpath("//*[@id=\"login\"]"));
        String mail = randommailElement.getAttribute("value");
        randommail.close();



        WebDriver browser = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(browser, 30);
        browser.get("https://connect-th.beinsports.com/en");
        browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        Thread.sleep(1000);

        //Ana Sayfadayken Subscribe Butonuna basılmadan önce
        browser.findElement(By.xpath("/html/body/div[4]/div/nav/div[3]/ul/li[3]/a")).click();
        Thread.sleep(2000);

        //Subscribe Butonuna basıldıktan sonra
        browser.findElement(By.xpath("/html/body/div[5]/div[1]/div[3]")).click();
        Thread.sleep(2000);

        //İkinci Subscribe butonuna basıldıktan sonra
        browser.findElement(By.xpath("/html/body/div[5]/div[4]/div/div[2]/div[2]/div[2]/a")).click();
        Thread.sleep(2000);

        //Kayıt olma

        CreateAccount createAccount = new CreateAccount(browser) ;
        Thread.sleep(1000);
        createAccount.typeName("Name");
        Thread.sleep(1000);
        createAccount.typeSurname("SurName");
        Thread.sleep(1000);
        createAccount.typeEmail(mail);
        Thread.sleep(1000);
        createAccount.typePassword("Asds123");
        Thread.sleep(1000);
        createAccount.button();


        //Onay
        OnaylamaSayfasi onaylamaSayfasi = new OnaylamaSayfasi(browser);
        Thread.sleep(3000);
        onaylamaSayfasi.pressX();
        Thread.sleep(1000);
        onaylamaSayfasi.markBox();
        Thread.sleep(1000);
        onaylamaSayfasi.pressButton();


        //Kredi Kartı
        KartBilgileri kartBilgileri = new KartBilgileri(browser);
        Thread.sleep(5000);
        kartBilgileri.KartAdi("KartAdı");
        Thread.sleep(1000);
        kartBilgileri.KartNumarasi("4532251641757362");
        Thread.sleep(1000);
        kartBilgileri.Exmm("02");
        Thread.sleep(1000);
        kartBilgileri.Exyy("2022");
        Thread.sleep(1000);
        kartBilgileri.OnayKodu("231");
        Thread.sleep(1000);
        kartBilgileri.Confirm();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"ncol_cancel\"]")));

        Thread.sleep(5000);
        browser.close();


    }
}
