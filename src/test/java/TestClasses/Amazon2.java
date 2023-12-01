package TestClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.image.RasterOp;
import java.time.Duration;
import java.util.List;

public class Amazon2 {

@Test
    public void amazon2()
    {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.in/");


    WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
    search.click();
    search.sendKeys("iphone 11");



     WebElement suggestion = driver.findElement(By.xpath("(//div[@class='s-suggestion-container'])[1]"));
     suggestion.click();
     WebElement icon = driver.findElement
             (By.xpath("//span[normalize-space()='Include Out of Stock']"));

     icon.click();


      //  List<WebElement> prices = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
     //   System.out.println(prices.size());
        List <WebElement> rows = driver.findElements(By.className("puisg-row"));
        System.out.println(rows.size());


            SoftAssert softAssert =null;

            for(WebElement w :rows)
           {

               softAssert = new SoftAssert();
               WebElement each_price = w.findElement(By.xpath("//span[@class='a-price-symbol']"));

               if(each_price.getText().contains("₹"))
               {

                    softAssert.assertTrue(true);

               }
               else{

                   softAssert.assertTrue(false);
                   softAssert.assertAll();
               }





//               String price = each_price.getText();
//              // softAssert.assertTrue(each_price.getText().contains());
//               softAssert.assertNotNull(price,"no price");






//               if(price.isDisplayed())
//               {
//                   Assert.assertTrue(true);
//
//               }
//               else{
//                   Assert.assertTrue(false);
//                   System.out.println("Price Not Displayed");
//               }
//

//
   }






}}

