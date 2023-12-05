package TestClasses;

import PageObjectModels.LambdaPage;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class InvalidSearch {


    @Test
    public void InvalidSearchTest() {
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ecommerce-playground.lambdatest.io/");


        LambdaPage lambda = new LambdaPage(driver);

        lambda.enterText("svd326478");

        lambda.clickSubmit();

        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("invalidPage.png");
        try {
            FileUtils.copyFile(screenshotFile, destinationFile);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Assert.assertEquals
//                (driver.findElement(By.xpath("(//p[contains(text(),'There is no product that matches the search criter')])[1]")).getText(),
//                      "There is no product that matches the search criteria.","there is a product");

        Assert.assertEquals
                (driver.findElement(By.cssSelector("div[id='entry_212469'] p")).getText(),
                        "There is no product that matches the search criteria.","there is a product");


        System.out.println(driver.findElement(By.cssSelector("div[id='entry_212469'] p")).getText());

        // driver.quit();


    }}

