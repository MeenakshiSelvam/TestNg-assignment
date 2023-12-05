package TestClasses;

import PageObjectModels.LambdaPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchFilter {

    @Test
    public void AdvancedSearchTest() {


        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");


        LambdaPage lambda = new LambdaPage(driver);



        lambda.enterText("iphone");
        lambda.clickSubmit();

        lambda.enterCategory("Tablets");
        lambda.clickSearch();


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlContains("iphone"));



        Assert.assertEquals
                (driver.findElement(By.xpath("//h1[normalize-space()='iPhone']")).getText(),"Tablets","No Tablet");

    }}

