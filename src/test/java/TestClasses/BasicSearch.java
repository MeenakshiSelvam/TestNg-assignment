package TestClasses;
import PageObjectModels.LambdaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicSearch {

    @Test
    public void basicSearchTest() {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");

//        Assert.assertEquals
//                (driver.getCurrentUrl(),"https://ecommerce-playground.lambdatest.io/","url mis-matching");
        //Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Url MisMatching");

        LambdaPage lambda = new LambdaPage(driver);


        lambda.enterText("iphone");

        lambda.clickSubmit();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("iphone"));

        // driver.quit();





    }
}



