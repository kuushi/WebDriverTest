package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTestExe {
    private WebDriver driver;

    public void setDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        WebElement weblink = driver.findElement(By.linkText("Shifting Content"));
        weblink.click();
        System.out.println(driver.getTitle());
        WebElement sublink = driver.findElement(By.linkText("Example 1: Menu Element"));
        sublink.click();
        List<WebElement>taglist= driver.findElements(By.tagName("li"));
        System.out.println("there are "+ taglist.size()+" tags");

    }

    public static void main(String args[]){
        BaseTestExe Obj=new BaseTestExe();
        Obj.setDriver();
    }
}
