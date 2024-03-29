import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;
    @Before
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

    }

    @Test
    public void loginWithValidCredentials() {

        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("fasttesting@mailinator.com");
        driver.findElement(By.id("pass")).sendKeys("testing");
        driver.findElement(By.id("send2")).click();
        WebElement welcomeTextElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > div.welcome-msg > p.hello > strong"));
        String welcomeText = welcomeTextElement.getText();

        Assert.assertTrue(welcomeTextElement.isDisplayed());
        Assert.assertEquals("Hello, l ff!", welcomeText);



    }

    @Test
    public void loginWithInvalidCredentials() {

        WebElement accountLink = driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label"));
        accountLink.click();
        driver.findElement(By.cssSelector("#header-account > div > ul > li.last > a")).click();
        driver.findElement(By.id("email")).sendKeys("fasttesting@mailinator.com");
        driver.findElement(By.id("pass")).sendKeys("testing");
        driver.findElement(By.id("send2")).click();
        String text = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > ul > li > ul > li > span")).getText();

        if (text.equals("Invalid login or password."))
            System.out.println("Success");
        else
            System.err.println("Fail");

    }


    @After
    public void close() {

        driver.quit();
    }
}
