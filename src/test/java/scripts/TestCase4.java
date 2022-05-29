package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase4 extends Base{

    @Test
    public void ComfyEliteSendMsgForm(){

        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsLink.click();
        // ========== Testing redirection to "Contact Us" page ==========
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "User IS on Contact Us page SUCCESS" : "User is NOT on Contact Us page FAILURE");

        // ========== Find web elements for 1st name, last name, email, and msg box and labels ==========
        WebElement firstNameBox = driver.findElement(By.id("input28"));
        WebElement lastNameBox = driver.findElement(By.id("input41"));
        WebElement emailBox = driver.findElement(By.id("input48"));
        WebElement firstNameLabel = driver.findElement(By.id("input52"));
        WebElement lastNameLabel = driver.findElement(By.id("input53"));
        WebElement emailLabel = driver.findElement(By.id("input54"));
        WebElement msgBox = driver.findElement(By.cssSelector("textarea[role='textbox']"));
        //// ========== Testing firstname box, label, and enter txt example ==========
        if(firstNameBox.isDisplayed() && firstNameLabel.getText().equals("First Name*")) System.out.println("First name validation SUCCESS");
        else throw new NotFoundException("First name validation FAILURE");
        String firstName = "David";
        firstNameBox.sendKeys(firstName);
        if(firstNameBox.getAttribute("value").equals(firstName)) System.out.println("Value sent to first name is displayed as expected");
        else throw new NotFoundException("Value sent to first name input box is not displayed as expected");





        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "Redirect to Contact Page successful" : "Redirect to Contact Page failed");

    }
}
