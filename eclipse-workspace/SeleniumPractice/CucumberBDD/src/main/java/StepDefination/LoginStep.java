package StepDefination;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;   // ✅ correct import

public class LoginStep {

	WebDriver driver;

    @Given("^user is already on Login Page$")
    public void user_already_on_login_page() {
        driver = new ChromeDriver();   // ✅ Selenium Manager resolves the driver
        driver.manage().window().maximize();
        driver.get("https://freecrm.com/");
    }


    @When("^title of login page is Free CRM$")
    public void title_of_login_page_is_free_CRM() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(
            "#1 Free CRM for Any Business: Online Customer Relationship Software",
            title
        );
    }

    @Then("^user enters username and password$")
    public void user_enters_username_and_password(DataTable credentials) {
        List<List<String>> data = credentials.raw();
        driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
        driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);
    }

    @Then("^user is on home page$")
    public void user_is_on_home_page() {
        String title = driver.getTitle();
        System.out.println("Home Page title ::" + title);
        Assert.assertEquals("CRMPRO", title);
    }

    //@Then("^Close the browser$")
    //public void close_the_browser() {
      //  driver.quit();
    }
}