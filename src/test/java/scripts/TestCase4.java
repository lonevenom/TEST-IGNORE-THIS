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
        WebElement firstNameBox = driver.findElement(By.xpath("//form=@id='input16']"));
        WebElement lastNameBox = driver.findElement(By.cssSelector("input41"));
        WebElement emailBox = driver.findElement(By.id("input48"));
        WebElement firstNameLabel = driver.findElement(By.cssSelector("form[data-ux='InputFloatLabelLabel']"));
        WebElement lastNameLabel = driver.findElement(By.id("input53"));
        WebElement emailLabel = driver.findElement(By.id("input54"));
        WebElement msgBox = driver.findElement(By.cssSelector("textarea[role='textbox']"));
        // ========== Testing firstname box, label, and enter txt example ==========
        if(firstNameBox.isDisplayed() && firstNameLabel.getText().equals("First Name*"))
            System.out.println("First name validation SUCCESS");
        else throw new NotFoundException("First name validation FAILURE");
        String firstName = "David";
        firstNameBox.sendKeys(firstName);
        if(firstNameBox.getAttribute("value").equals(firstName))
            System.out.println("Text sent to first name box is working SUCCESS");
        else throw new NotFoundException("Text sent to first name box is NOT working FAILURE");
        // ========== Testing last name box, label, and enter txt example ==========
        if(lastNameBox.isDisplayed() && lastNameLabel.getText().equals("Last Name*"))
            System.out.println("Last name validation SUCCESS");
        else throw new NotFoundException("Last name validation FAILURE");
        String lastName = "Lopez";
        lastNameBox.sendKeys(lastName);
        if(lastNameBox.getAttribute("value").equals(lastName))
            System.out.println("Text sent to last name box is working SUCCESS");
        else throw new NotFoundException("Text sent to last name box is NOT working FAILURE");
        // ========== Testing email box, label, and enter txt example ==========
        if(emailBox.isDisplayed() && emailLabel.getText().equals("Last Name*"))
            System.out.println("Last name validation SUCCESS");
        else throw new NotFoundException("Last name validation FAILURE");
        String email = "davidlpalmerin@outlook.com";
        emailBox.sendKeys(email);
        if(emailBox.getAttribute("value").equals(email))
            System.out.println("Text sent to email box is working SUCCESS");
        else throw new NotFoundException("Text sent to email box is NOT working FAILURE");
        // ========== Testing message box and enter txt example ==========
        if(msgBox.isDisplayed()) System.out.println("Last name validation SUCCESS");
        else throw new NotFoundException("Last name validation FAILURE");
        String messageText = "i LoVe jAvA aNd SeLeNiUm! (:";
        msgBox.sendKeys(messageText);
        if(msgBox.getAttribute("value").equals(messageText))
            System.out.println("Text sent to email box is working SUCCESS");
        else throw new NotFoundException("Text sent to email box is NOT working FAILURE");



        System.out.println(driver.getCurrentUrl().equals("https://comfyelite.com/contact-us") ?
                "Redirect to Contact Page successful" : "Redirect to Contact Page failed");

    }
}
