package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class RegisterTest extends Utility {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyThatSigningUpPageDisplay() {
        // Click on Register link
        //WebElement register = driver.findElement(By.linkText("Register"));
        //register.click();
        clickOnElement(By.linkText("Register"));
        //driver.findElement(By.linkText("Signing up is easy!"));
        clickOnElement(By.linkText("Signing up is easy!"));
    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {

        // Click on Register link
        //driver.findElement(By.linkText("Register")).click();
        clickOnElement(By.linkText("Register"));
        // Enter First name
        //driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys("Umi");
        sendTextToElement(By.xpath("//input[@id='customer.firstName']"), "Umi");
        // Enter Last name
        //driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys("Patel");
        sendTextToElement(By.xpath("//input[@id='customer.lastName']"), "Patel");
        //Enter Address
        //driver.findElement((By.xpath("//input[@id='customer.address.street']"))).sendKeys("Queen Road");
        sendTextToElement(By.xpath("//input[@id='customer.address.street']"), "Queen Road");
        //driver.findElement((By.xpath("//input[@id='customer.address.city']"))).sendKeys("London");
        sendTextToElement(By.xpath("//input[@id='customer.address.city']"), "London");
        //driver.findElement((By.xpath("//input[@id='customer.address.state']"))).sendKeys("England");
        sendTextToElement(By.xpath("//input[@id='customer.address.state']"), "England");
        //driver.findElement((By.xpath("//input[@id='customer.address.zipCode']"))).sendKeys("WA26RJ");
        sendTextToElement(By.xpath("//input[@id='customer.address.zipCode']"), "WA26RJ");
        //Enter Phone, SSN, Username, Password and Confirm Password
        //driver.findElement((By.xpath("//input[@id='customer.phoneNumber']"))).sendKeys("umipatel@gmail.com");
        sendTextToElement(By.xpath("//input[@id='customer.phoneNumber']"), "umipatel@gmail.com");
        //driver.findElement((By.xpath("//input[@id='customer.ssn']"))).sendKeys("123abc");
        sendTextToElement(By.xpath("//input[@id='customer.ssn']"), "123abc");
        //driver.findElement((By.xpath("//input[@id='customer.username']"))).click();
        clickOnElement(By.xpath("//input[@id='customer.username']"));
        //driver.findElement((By.xpath("//input[@id='customer.password']"))).sendKeys("umi123");
        sendTextToElement(By.xpath("//input[@id='customer.password']"), "umi123");
        driver.findElement((By.xpath("//input[@id='repeatedPassword']"))).sendKeys("umi123");
        sendTextToElement(By.xpath("//input[@id='repeatedPassword']"), "umi123");
        // Click Register button
        driver.findElement((By.xpath("//tbody/tr[13]/td[2]/input[1]"))).click();
        clickOnElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
    }

    @After
    public void stop() {
        closeBrowser();

    }

}

