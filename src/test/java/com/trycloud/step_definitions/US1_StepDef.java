package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.TryCloudStory3;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US1_StepDef extends BasePage {

    LoginPage loginPage = new LoginPage();
    TryCloudStory3 tryCloudStory3 = new TryCloudStory3();


    @Given("user on the login page Try Cloud Login Page")
    public void user_on_the_login_page_try_cloud_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("user use username {string} and passcode {string}")
    public void user_use_username_and_passcode(String username, String password) {
        loginPage.username.sendKeys(username);
        loginPage.password.sendKeys(password);
    }
    @When("user click the login button")
    public void user_click_the_login_button() {
        loginPage.loginBtn.click();
    }
    @Then("verify the user should be at the dashboard page")
    public void verify_the_user_should_be_at_the_dashboard_page() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard"));

    }


    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));

    }
    @When("the users  log in with valid credentials")
    public void the_users_log_in_with_valid_credentials() {
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
    }
    @Then("Verify the user see the following modules:")
    public void verify_the_user_see_the_following_modules(List<String>expectedDashboard) throws InterruptedException {


        List<WebElement> actualDashboard =tryCloudStory3.dashboardDropDown;
        for (WebElement element: actualDashboard) {

            Assert.assertTrue(expectedDashboard.contains(element.getAttribute("aria-label")));
        }
    }
}
