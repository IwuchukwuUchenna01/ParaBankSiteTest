package ParaBank;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;

public class ParaBankObjects {
    WebDriver driver;
    WebDriverWait wait;

    WebElement element;

    public  void setUp(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get(Selectors.siteUrl);
        driver.manage().window().maximize();
    }
    public void accountRegistration(){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(Selectors.userNameInput)));
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id(Selectors.firstName)).sendKeys("uchenna");
        driver.findElement(By.id(Selectors.lastName)).sendKeys("iwuchukwu");
        driver.findElement(By.id(Selectors.street)).sendKeys("25 ilupeju street");
        driver.findElement(By.id(Selectors.city)).sendKeys("Lagos");
        driver.findElement(By.id(Selectors.state)).sendKeys("Lagos");
        driver.findElement(By.id(Selectors.zipCode)).sendKeys("12345");
        driver.findElement(By.id(Selectors.phoneNumber)).sendKeys("+23456789053678");
        driver.findElement(By.id(Selectors.ssn)).sendKeys("22345");
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
    /*public void verifySuccess(String element){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(element)));
        WebElement verified = driver.findElement(By.cssSelector(element));
        String verifiedText = verified.getText();
        Assert.
    }*/
    public void tearDown(){
        driver.quit();
    }
    public static void main(String [] args){
        ParaBankObjects bank = new ParaBankObjects();
        bank.setUp();
        bank.accountRegistration();
        //bank.tearDown();
        //bank.accountLogin();
    }
}
