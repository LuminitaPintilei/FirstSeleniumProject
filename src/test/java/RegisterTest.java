import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterTest {
@Test
    public void registerNewUser() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");
        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li:nth-child(5) > a")).click();
        driver.findElement(By.id("firstname")).sendKeys("Alina");
        driver.findElement(By.id("lastname")).sendKeys("Pop");
        driver.findElement(By.id("email_address")).sendKeys("newmailtest@mailinator.com");
        driver.findElement(By.id("password")).sendKeys("newpass");
        driver.findElement(By.id("confirmation")).sendKeys("newpass");
        driver.findElement(By.cssSelector("#form-validate > div.buttons-set > button > span > span")).click();
    }
}
