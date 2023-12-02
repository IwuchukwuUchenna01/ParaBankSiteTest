package ParaBank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.util.Random;

import java.time.Duration;

public class ParaBankObjects {
    WebDriver driver;
    WebDriverWait wait;

    WebElement element;

    Random rand = new Random();
    int upperbound = 25;
    // Generating random values from 0 - 24
    // using nextInt()
    int int_random = rand.nextInt(upperbound);

    public  void setUp(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get(Selectors.siteUrl);
        driver.manage().window().maximize();
    }
    public void accountRegistration(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(Selectors.userNameInput)));
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id(Selectors.firstName)).sendKeys(Selectors.getFirstName);
        driver.findElement(By.id(Selectors.lastName)).sendKeys(Selectors.getLastName);
        driver.findElement(By.id(Selectors.street)).sendKeys(Selectors.getStreet);
        driver.findElement(By.id(Selectors.city)).sendKeys(Selectors.getCity);
        driver.findElement(By.id(Selectors.state)).sendKeys(Selectors.getState);
        driver.findElement(By.id(Selectors.zipCode)).sendKeys(Selectors.getZipCode);
        driver.findElement(By.id(Selectors.phoneNumber)).sendKeys(Selectors.getPhoneNumber);
        driver.findElement(By.id(Selectors.ssn)).sendKeys(Selectors.getSsn);
        driver.findElement(By.id(Selectors.UserNameReg)).sendKeys(Selectors.userName);
        driver.findElement(By.id(Selectors.passwordReg)).sendKeys(Selectors.password);
        driver.findElement(By.id(Selectors.confirmPasswordReg)).sendKeys(Selectors.password);
        driver.findElement(By.cssSelector(Selectors.submitButton)).click();

    }
    public void accountLogin(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(Selectors.userNameInput)));
        driver.findElement(By.cssSelector(Selectors.userNameInput)).sendKeys(Selectors.userName);
        driver.findElement(By.cssSelector(Selectors.passwordInput)).sendKeys(Selectors.password);
        driver.findElement(By.cssSelector(Selectors.login)).click();
    }
    public void verifySuccess(String element,String originalText){
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(element)));
        WebElement verifiableElement = driver.findElement(By.cssSelector(element));
        String verifiableText = verifiableElement.getText();
        Assert.assertEquals(originalText,verifiableText);

    }
    public void logOut(){
        driver.findElement(By.cssSelector(Selectors.logout)).click();
    }

    public void verifySignUp(){
        verifySuccess(Selectors.confirmMessageTitle,Selectors.ConfirmMessageTxt[0]);
    }
    public void verifyLogin(){
        verifySuccess(Selectors.confirmMessageTitle, Selectors.ConfirmMessageTxt[1]);
    }
    public void tearDown(){
        driver.quit();
    }

}
