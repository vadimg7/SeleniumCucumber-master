package org.softpost;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Map;

/**
 * Created by Sagar on 05-02-2017.
 */
public class SeleniumSteps {
    WebDriver driver;
    public SeleniumSteps (MySharedClass mySharedClass){
      // driver = mySharedClass.startBrowser();
        System.out.println(mySharedClass.id);
        this.driver = mySharedClass.getDriver();
    }


    @Given("^I am on the home page of softpost$")
    public void iAmOnTheHomePageOfSoftpost() throws Throwable {
         driver.get("http://www.softpost.org");

    }

    //I am on the home page of the <website>
    @Given("^I am on the home page of the \"(.*)\"$")
    public void iAmOnTheWebsite(String website) throws Throwable {
               driver.get(website);
    }

    @Then("^I verify that title contains \"(.*)\"$")
    public void iShouldSeeThatTitleContains(String title) throws Throwable {
        assert driver.getTitle().toLowerCase().contains(title);

    }

    @Then("^I should see that title contains tutorials$")
    public void iShouldSeeThatTitleContainsTutorials() throws Throwable {
        assert driver.getTitle().toLowerCase().contains("tutorfgfgials");
    }

    @Then("^I should see that source contains tutorials$")
    public void iShouldSeeThatSourceContainsTutorials() throws Throwable {
        assert driver.getPageSource().toLowerCase().contains("tutorials");

    }

    @Given("^I verify the website title as mentioned below$")
    public void i_verify_the_website_title_as_mentioned_below(Map<String,String> dataMap) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        //throw new PendingException();

        String website = dataMap.get("website");
        String title = dataMap.get("tutorials");
        System.out.println(dataMap.get("user"));
        driver.get(website);
        assert driver.getTitle().toLowerCase().contains(title);

    }


    @Then("^I am on the url \"(.*)\"$")
    public void iAmOnUrl(String url) throws Throwable {

        driver.get(url);

    }

    @Then("^I verify that I can enter first name as (.*)$")
    public void iEnterFirstName(String firstName) throws Throwable {
        driver.findElement(By.id("fn")).sendKeys(firstName);
    }

    @Then("^I verify that I can enter last name as (.*)$")
    public void iEnterLastName(String lastName) throws Throwable {
        driver.findElement(By.xpath("(//input)[4]")).sendKeys(lastName);
        Thread.sleep(2000);

    }

}
