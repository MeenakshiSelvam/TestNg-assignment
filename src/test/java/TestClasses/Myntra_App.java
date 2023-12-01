package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Myntra_App {
    @Test
    public  void myntra()
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.myntra.com/");


        WebElement men = driver.findElement(By.xpath("//a[normalize-space()='Men' and @class='desktop-main']"));
        Actions action = new Actions(driver);
        action.moveToElement(men).build().perform();


        //WebElement suggestion = driver.findElement(By.xpath("(//a[@href='/men-tshirts'])[1]"));
        //WebElement suggestion = driver.findElement(By.xpath("//a[@data-reactid = '31' ]"));

        WebElement suggestion = driver.findElement(By.xpath("//a[contains(text(),'T-Shirts')]"));
        suggestion.click();

          }

}
