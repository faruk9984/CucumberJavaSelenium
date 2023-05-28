import Pages.login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class StepDedinition {
    public WebDriver driver;
    @Given("User visited to the ecommerce site")
    public void user_visits_e_commerce_website() throws Exception {
        System.setProperty("webdriver.gecko.driver", "./src/test/resources/geckodriver.exe");
        FirefoxOptions ops=new FirefoxOptions();
        ops.addArguments("--headed"); //uncomment if you want to run in headless mode
        driver = new FirefoxDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://automationexercise.com/");

    }

    @When("User inputs valid {string} and {string}")
    public void user_enters_valid_credentials(String email, String password) throws Exception {
        login loogin=new login(driver);
        loogin.dologin(email,password);

//        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
//        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("faruk15-9984@diu.edu.bd");
//        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("12345678");
//        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();

    }

    @Then("User can logged in successfully")
    public void user_can_logged_in_successfully() throws Exception {
        driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
        driver.close();

    }
}
