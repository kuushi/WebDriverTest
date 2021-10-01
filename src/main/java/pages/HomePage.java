package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By formAuthenticaionLink = By.linkText("Form Authentication");
    private By dropdownLink= By.linkText("Dropdown");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage click_formAuthenticaionLink() {
        driver.findElement(formAuthenticaionLink).click();
        return new LoginPage(driver);
    }
    public  DropdownPage click_dropdownLink(){
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }
}
