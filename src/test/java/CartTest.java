import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CartTest {
@Test
    public void addToCartTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");



        WebElement category = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-5.parent > a"));
        category.click();

        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > h2 > a")).click();
        driver.findElement(By.cssSelector("#swatch27 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#option81")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();


    }
}
