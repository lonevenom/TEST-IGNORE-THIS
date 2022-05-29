package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 extends Base{

    @Test
    public void  ComfyEliteContactUs(){

        driver.get("https://comfyelite.com/");
        WebElement contactUsLink = driver.findElement(By.cssSelector("a[href='/contact-us']"));
        contactUsLink.click();
        // ========== Testing redirection to "Contact Us" page ==========
        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "User IS on Contact Us page SUCCESS" : "User is NOT on Contact Us page FAILURE");
        // ========== Testing header2 (Contact Us) ==========
        try {
            WebElement heading2 = driver.findElement(By.cssSelector("h2[data-aid='CONTACT_SECTION_TITLE_REND']"));
            Assert.assertEquals(heading2.getText(), "Contact Us");
            System.out.println("Heading2 reads as \"Contact Us\" SUCCESS");
        } catch (Exception e) {
            System.out.println("Heading2 does NOT read as \"Contact Us\" FAILURE");
        }
        // ========== Testing header4 (Send us a msg) ==========
        try {
            WebElement heading4 = driver.findElement(By.cssSelector("h4[data-aid='CONTACT_FORM_TITLE_REND']"));
            Assert.assertEquals(heading4.getText(), "SEND US A MESSAGE");
            System.out.println("Heading2 reads as \"SEND US A MESSAGE\" SUCCESS");
        } catch (Exception e) {
            System.out.println("Heading4 does NOT read as \"SEND US A MESSAGE\" FAILURE");
        }
    }
}
