package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        // Find the username field element
        //WebElement emailField = driver.findElement(By.name("username"));
        // Sending username to username field element
        //emailField.sendKeys("prime123");
        sendTextToElement(By.name("username"), "prime123");

        // Find the password field element
        //WebElement passwordField = driver.findElement(By.name("password"));
        // Sending Password to password field element
        //passwordField.sendKeys("Prime123!");
        sendTextToElement(By.name("password"), "Prime123!");

        //Find the login button and click on it
        //WebElement loginButton = driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));
        //loginButton.click();
        clickOnElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));

    }



    @Test
    public void verifyTheErrorMessage() {

        // Find the username field element
        //WebElement emailField = driver.findElement(By.name("username"));
        // Sending username to username field element
        //emailField.sendKeys("prime123");
        sendTextToElement(By.name("username"), "prime");

        // Find the password field element
        //WebElement passwordField = driver.findElement(By.name("password"));
        // Sending Password to password field element
        //passwordField.sendKeys("Prime123!");
        sendTextToElement(By.name("password"), "xyz!");

        //Find the login button and click on it
        //WebElement loginButton = driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));
        //loginButton.click();
        clickOnElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));

        String expectedErrorMessage = "The username and password could not be verified.";
        //String actualErrorMessage = driver.findElement(By.xpath("//p[contains(text(),'The username and password could not be verified.')]")).getText();
        String actualErrorMessage = getTextFromElement(By.xpath("//p[contains(text(),'The username and password could not be verified.')]"));

        // Validate actual and expected message
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @Test
    public void userShouldLogOutSuccessfully() {

        // Find the username field element
        //WebElement emailField = driver.findElement(By.name("username"));
        // Sending username to username field element
        //emailField.sendKeys("prime123");
        sendTextToElement(By.name("username"), "prime123");

        // Find the password field element
        //WebElement passwordField = driver.findElement(By.name("password"));
        // Sending Password to password field element
        //passwordField.sendKeys("Prime123!");
        sendTextToElement(By.name("password"), "Prime123!");

        //Find the login button and click on it
        //WebElement loginButton = driver.findElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));
        //loginButton.click();
        clickOnElement(By.xpath("//body/div[@id='mainPanel']/div[@id='bodyPanel']/div[@id='leftPanel']/div[@id='loginPanel']/form[1]/div[3]/input[1]"));

        //Find the logout button and click on it
        //WebElement logoutButton = driver.findElement(By.xpath("//a[contains(text(),'Log Out')]"));
        //logoutButton.click();
        clickOnElement(By.xpath("//a[contains(text(),'Log Out')]"));

        String expectedErrorMessage = "Customer Login";
        //String actualErrorMessage = driver.findElement(By.xpath("//h2[contains(text(),'Customer Login')]")).getText();
        String actualErrorMessage = getTextFromElement(By.xpath("//h2[contains(text(),'Customer Login')]"));

        // Validate actual and expected message
        Assert.assertEquals("Customer Login not displayed", expectedErrorMessage, actualErrorMessage);
    }

    @After
    public void tearDown() {
        closeBrowser();
    }

}



