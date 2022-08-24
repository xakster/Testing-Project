package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {
    
    public HomePage(WebDriver driver) {
        super(driver);
    }

    String baseURL="http://automationpractice.com/index.php";
    
    By numberOfProductsPopularBy = By.cssSelector("ul#homefeatured>li");
    By numberOfProductsBestSellersBy = By.cssSelector("ul#blockbestsellers>li");
    

    public HomePage basePage(){
    driver.get(baseURL);
    return this;
}    
public HomePage validateNumberOfProductsPopular(int expectedNumberOfProducts){
    int actualNumberOFProducts = locateElements(numberOfProductsPopularBy).size();
    assertIntegerEquals(expectedNumberOfProducts, actualNumberOFProducts);
    return this;
}
public HomePage validateNumberOfProductsBestSeller(int expectedNumberOfProducts){
    int actualNumberOFProducts = locateElements(numberOfProductsBestSellersBy).size();
    assertIntegerEquals(expectedNumberOfProducts, actualNumberOFProducts);
    return this;
}
}