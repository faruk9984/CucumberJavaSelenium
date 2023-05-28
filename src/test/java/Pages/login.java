package Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
    @FindBy(xpath = "//a[normalize-space()='Signup / Login']")
    WebElement btnlogin;
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement txtemail;
    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement txtpassword;
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement txtsubmit;
    @FindBy(xpath = "//a[normalize-space()='Logout']")
    WebElement logout;

    public login(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void dologin(String email, String password){
        btnlogin.click();
        txtemail.sendKeys(email);
        txtpassword.sendKeys(password);
        txtsubmit.click();
    }
}
