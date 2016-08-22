import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by Aleksei on 19.08.2016.
 */
public class Base {
    public WebDriver driver;

    @BeforeClass
    public void getDriver(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public  void loadSenderPage(){
        driver.get("https://chat.sender.mobi/");
        driver.findElement(By.cssSelector("[class='sf_auth_manual_phone']")).sendKeys("660300589");
        driver.findElement(By.cssSelector("[class='sf_auth_manual_button']")).click();
        driver.findElement(By.cssSelector("[type='password']")).sendKeys("qqqq");
        driver.findElement(By.cssSelector("[class='sf_bitcoin_modal_button_continue']")).click();
    }


}
