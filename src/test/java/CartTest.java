import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CartTest {

    public void addToCartTest(){
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://testfasttrackit.info/selenium-test/");


        // TODO Implement add to cart steps
        WebElement category = driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.parent"));
        category.click();

        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.active.parent"));
        driver.findElement(By.cssSelector("#nav > ol > li.level0.nav-1.first.active.parent > ul > li.level1.nav-1-2.active")).click();
        driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col3-layout > div > div.col-wrapper > div.col-main > div.category-products > ul > li:nth-child(1) > div > div.actions > a")).click();
        driver.findElement(By.cssSelector("#swatch81 > span.swatch-label")).click();
        driver.findElement(By.cssSelector("#product_addtocart_form > div.product-shop > div.product-options-bottom > div.add-to-cart > div.add-to-cart-buttons > button > span > span")).click();


    }
}
