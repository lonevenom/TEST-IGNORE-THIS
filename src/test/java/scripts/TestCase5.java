package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase5 extends Base{

    @Test
    public void ComfyEliteContactUsPageSignUp() throws InterruptedException {
        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsLink.click();

        // ========== Testing redirection to "Contact Us" page ==========
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "User IS on Contact Us page SUCCESS" : "User is NOT on Contact Us page FAILURE");

        // ========== Testing Sign Up Check box ==========
        WebElement signUpCheckBox = driver.findElement(By.xpath("//label[@data-ux='InputCheckbox']/input"));
        WebElement signUpCheckBoxClickArea = driver.findElement(By.xpath("//label[@data-ux='InputCheckbox']/div"));
        //(empty checkbox)
        if(!signUpCheckBox.isSelected()) System.out.println("Check box is empty");
        else throw new NotFoundException("Check box is selected without clicking it FAILURE");
        Thread.sleep(2000);
        signUpCheckBoxClickArea.click();
        //(checkbox enabled)
        if(signUpCheckBox.isSelected()) System.out.println("Check box is selected after the click");
        else throw new NotFoundException("Check box is not selected after the click FAILURE");
        Thread.sleep(2000);
        signUpCheckBoxClickArea.click();
        //(uncheck again)
        if(!signUpCheckBox.isSelected()) System.out.println("Check box is unchecked after the second click");
        else throw new NotFoundException("Check box is not getting deselected after the second click FAILURE");
    }
}