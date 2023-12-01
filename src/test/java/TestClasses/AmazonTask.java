package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class AmazonTask {

    @Test
    public void amazon()
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");


        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.click();
        search.sendKeys("iphone");
        WebElement suggestion =driver.findElement(By.xpath("(//div[@aria-label='iphone 15 pro max'])[1]"));
        suggestion.click();
        List<WebElement> symbol = driver.findElements(By.className("a-price-symbol"));
        List<WebElement> price = driver.findElements(By.className("a-price-whole"));
        System.out.println("number of price values: " + price.size());


        int count = 0;
        for(WebElement w : price)
        {
            System.out.println(w.getText());
            Assert.assertTrue(w.isDisplayed());
            count ++;

        }
        System.out.println("Number of Price Values that Displayed : " + count);








    }

}
