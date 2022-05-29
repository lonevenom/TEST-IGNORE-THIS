package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class TestCase1 extends Base{

    @Test
    public void ComfyEliteContactUsPage(){
        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsLink.click();

        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "User IS on Contact Us page SUCCESS" : "User is NOT on Contact Us page FAILURE");

        WebElement logo = driver.findElement(By.id("n-48560"));
        System.out.println(logo.isDisplayed() ?
                "Logo displayed SUCCESS" : "Logo displayed FAILURE");

        WebElement header2 = driver.findElement(By.id("dynamic-tagline-48605"));
        System.out.println(header2.isDisplayed() ?
                "Header2 is displayed SUCCESS" : "Header2 is NOT displayed FAILURE");

    }

}
