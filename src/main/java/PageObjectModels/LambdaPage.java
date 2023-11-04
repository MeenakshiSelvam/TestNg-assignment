package PageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LambdaPage {

    WebDriver ld;

    private static final By SEARCH_BAR = By.xpath("//input[@name='search']");

    private static final By SUBMIT = By.xpath("//button[@type='submit']");

    private static final By CATEGORY = By.className("custom-select");
    private static final By Tablets = By.xpath
            ("/html[1]/body[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/select[1]/option[14]");
    private static final By CATEGORY_SEARCH = By.id("button-search");

    private static final By CAMERA_PRODUCT = By.xpath("//img[@title='Canon EOS 5D']");




    public LambdaPage(WebDriver rdriver) {
        ld = rdriver;
    }
    public void enterText(String text) {
        ld.findElement(SEARCH_BAR).clear();
        ld.findElement(SEARCH_BAR).sendKeys(text);
    }



    public void clickSubmit() {
        ld.findElement(SUBMIT).click();
    }

    public void enterCategory(String category)
    {
        ld.findElement(CATEGORY).click();

        ld.findElement(CATEGORY).sendKeys(category);
        ld.findElement(Tablets).click();
    }

    public void clickSearch()
    {
        ld.findElement(CATEGORY_SEARCH).click();
    }

    public void clickCameraProduct(){
        ld.findElement(CAMERA_PRODUCT).click();
    }


}
