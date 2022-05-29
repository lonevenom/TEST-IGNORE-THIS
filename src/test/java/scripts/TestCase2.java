package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends Base{

    @Test
    public void ComfyEliteConnectWithUs(){
        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsLink.click();
        // ========== Testing redirection to "Contact Us" page ==========
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "User IS on Contact Us page SUCCESS" : "User is NOT on Contact Us page FAILURE");
        // ========== Testing header1 ==========
        try {
            WebElement heading1 = driver.findElement(By.cssSelector("h1[role='heading']"));
            Assert.assertEquals(heading1.getText(), "Connect With Us");
            System.out.println("Web element heading1 was found");
        } catch (Exception e) {
            System.out.println("Web element heading1 was not found");
        }
        // ========== Testing Facebook logo and link ==========
        try {
            WebElement fbLink = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/103179127717601']"));
            fbLink.isEnabled();
            System.out.println("Facebook link validation PASSED");
        } catch (Exception e) {
            System.out.println("Facebook link validation FAILED");
        }
        try {
            WebElement fbLogo = driver.findElement(By.cssSelector("a[data-aid='SOCIAL_FACEBOOK_LINK']"));
            fbLogo.isDisplayed();
            System.out.println("Facebook logo validation PASSED");
        } catch (Exception e) {
            System.out.println("Facebook logo validation FAILED");
        }

        // ========== Testing Instagram logo and link ==========
        try {
            WebElement igLink = driver.findElement(By.cssSelector("a[href='https://www.instagram.com/comfyelite']"));
            igLink.isEnabled();
            System.out.println("Instagram link validation PASSED");
        } catch (Exception e) {
            System.out.println("Instagram link validation FAILED");
        }
        try {
            WebElement igLogo = driver.findElement(By.xpath("//a[@data-aid='SOCIAL_INSTAGRAM_LINK']"));
            igLogo.isDisplayed();
            System.out.println("Instagram logo validation PASSED");
        } catch (Exception e) {
            System.out.println("Instagram logo validation FAILED");
        }

    }
}
