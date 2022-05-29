package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase6 extends Base{

    @Test
    public void ComfyEliteContactUsPageSendButton(){

        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsLink.click();

        // ========== Testing redirection to "Contact Us" page ==========
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "User IS on Contact Us page SUCCESS" : "User is NOT on Contact Us page FAILURE");

        // ========== Testing Send Button and Button Text ==========
        WebElement sendButton = driver.findElement(By.cssSelector("button[data-aid='CONTACT_SUBMIT_BUTTON_REND']"));
        if(sendButton.isDisplayed() && sendButton.isEnabled() && sendButton.getText().equals("SEND"))
            System.out.println("Send button validation SUCCESS");
        else throw new NotFoundException("Send button validation FAILURE");

    }
}
