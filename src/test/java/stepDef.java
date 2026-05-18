import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class stepDef {

    WebDriver driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://ndosisimplifiedautomation.vercel.app/#login");
        driver.findElement(By.xpath("//div[@id='app-root']/nav/div/div[3]/button/span[2]")).click();

    }

    @And("I enter valid email email")
    public void i_enter_valid_email_email() {
        driver.findElement(By.id("login-email")).sendKeys("elaeza382401@gmail.com");


    }

    @And("I enter valid  password password")
    public void i_enter_valid_password_password() {

        driver.findElement(By.id("login-password")).sendKeys("@password123");

    }

    @When("I click the login button")
    public void i_click_the_login_button() {

        driver.findElement(By.id("login-submit")).click();



    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

        String expectedUrl = "https://ndosisimplifiedautomation.vercel.app/#dashboard";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
        System.out.println("Logged in successfully --> The URL matches the expected URL - " + actualUrl);

    }

}
