import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by Aleksei on 22.08.2016.
 */
public class SendMessage extends Base {
    int i;
    @Test
    public void sendMessage(){
        driver.findElement(By.cssSelector("[class='sf_sidebar_filter_input']")).sendKeys("алексей");
        driver.findElement(By.xpath("//div[@id='sndr-wrap']/div/div[2]/div[7]/div/ul/li/div[3]/div")).click();
        while (i<10){
            driver.findElement(By.cssSelector("[class='sf_chat_input']")).sendKeys(" "+i);
            driver.findElement(By.cssSelector("[class='sf_chat_input']")).sendKeys(Keys.ENTER);
            i++;
        }
    }
}
