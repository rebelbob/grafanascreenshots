package grafanascreenshots.pages;

import grafanascreenshots.Time;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    private By login = By.xpath("//input[@name='username']");
    private By password = By.xpath("//input[@name='password']");
    private By logInButton = By.xpath("//form[@name='loginForm']/div/button");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage typeLogin(){
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='username']")));
        driver.findElement(login).sendKeys("istouched@gmail.com");
        return this;
    }

    public LoginPage typePassword(){
        driver.findElement(password).sendKeys("cjcybh777");
        return this;
    }

    public LoginPage clickLogInButton(){
        driver.findElement(logInButton).click();
        return new LoginPage(driver);
    }

    public SQLPage logIn(String from, String till){
        this.typeLogin();
        this.typePassword();
        this.clickLogInButton();
        return new SQLPage(driver, Time.convert(from), Time.convert(till));
    }
}
