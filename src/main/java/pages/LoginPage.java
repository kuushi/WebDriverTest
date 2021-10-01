package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userName_Field=By.id("username");
    private By password_Field=By.id("password");
    private By login_Button=By.cssSelector("#login button");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUsername(String username){
        driver.findElement(userName_Field).sendKeys(username);
    }
    public void setPassword(String password){
        driver.findElement(password_Field).sendKeys(password);
    }
    public SecureAreaPage clickButton(){
        driver.findElement(login_Button).click();
        return new SecureAreaPage(driver);
    }
}
