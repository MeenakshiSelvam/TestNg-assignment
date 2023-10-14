package TestClasses;
//
//import PageObjectModels.DashboardPage;
import PageObjectModels.LambdaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class BasicSearch {

    @Test
    public void basicSearchTest() {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");


        LambdaPage lambda = new LambdaPage(driver);



        lambda.enterText("iphone");

        lambda.clickSubmit();

        driver.quit();





    }
}



