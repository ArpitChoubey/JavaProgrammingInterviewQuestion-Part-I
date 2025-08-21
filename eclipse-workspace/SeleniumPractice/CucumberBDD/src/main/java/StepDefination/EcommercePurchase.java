package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
// If you're using Cucumber 5+, replace above with: io.cucumber.java.en.*

public class EcommercePurchase {

    WebDriver driver;  // Class-level driver variable
   
    @Given("^user is already on E-Commerce Login Page$")
    public void user_is_already_on_ecommerce_login_page() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/"); 
    }
    
    @When("^title of login page is \"(.*)\"$")
    public void title_of_login_page_is(String title) {
        String pageTitle = driver.getTitle();
        if (!pageTitle.equals(title)) {
            throw new AssertionError("Expected title: " + title + " but found: " + pageTitle);
        }
    }

    @Then("^user enters valid username and password$")
    public void user_enters_valid_username_and_password() {
        driver.findElement(By.id("username")).sendKeys("testuser");
        driver.findElement(By.id("password")).sendKeys("password123");
    }

    @Then("^user clicks on login button$")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("loginBtn")).click();
    }

    @Then("^user is navigated to the home page$")
    public void user_is_navigated_to_the_home_page() {
        String homeTitle = driver.getTitle();
        if (!homeTitle.contains("Home")) {
            throw new AssertionError("User is not on Home Page!");
        }
    }

    @When("^user searches for a product \"(.*)\"$")
    public void user_searches_for_a_product(String product) {
        WebElement searchBox = driver.findElement(By.id("searchBox"));
        searchBox.sendKeys(product);
        driver.findElement(By.id("searchBtn")).click();
    }

    @When("^user selects the product from search results$")
    public void user_selects_the_product_from_search_results() {
        driver.findElement(By.xpath("//a[contains(text(),'Laptop')]")).click();
    }

    @Then("^user adds the product to the cart$")
    public void user_adds_the_product_to_the_cart() {
        driver.findElement(By.id("addToCart")).click();
    }

    @Then("^user proceeds to checkout$")
    public void user_proceeds_to_checkout() {
        driver.findElement(By.id("checkoutBtn")).click();
    }

    @Then("^user enters shipping and payment details$")
    public void user_enters_shipping_and_payment_details() {
        driver.findElement(By.id("address")).sendKeys("123 Main Street");
        driver.findElement(By.id("city")).sendKeys("Bangalore");
        driver.findElement(By.id("cardNumber")).sendKeys("4111111111111111");
        driver.findElement(By.id("expiryDate")).sendKeys("12/27");
        driver.findElement(By.id("cvv")).sendKeys("123");
    }

    @Then("^user confirms the order$")
    public void user_confirms_the_order() {
        driver.findElement(By.id("confirmOrder")).click();
    }

    @Then("^user sees order confirmation message$")
    public void user_sees_order_confirmation_message() {
        WebElement confirmationMsg = driver.findElement(By.id("orderSuccessMsg"));
        if (!confirmationMsg.getText().contains("Thank you for your purchase")) {
            throw new AssertionError("Order confirmation message not displayed!");
        }
    }
}