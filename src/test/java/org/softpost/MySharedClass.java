package org.softpost;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MySharedClass {
    private WebDriver driver = null;
    public String id = "9393";

   @Before
    public void startBrowser(){

        System.setProperty("webdriver.chrome.driver","C:\\work\\ChromeDriver 78.0.3904.70\\chromedriver.exe");
        if (driver==null)
        driver = new ChromeDriver();
    }

    public WebDriver getDriver(){
        return this.driver;
    }


    @After
    public void closeBrowser(Scenario scenario){

        if (scenario.isFailed()) {
           scenario.embed(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png");
           scenario.write("Scenario failed");
        }else{
           scenario.write("Scenario passed");
        }

        driver.close();
        driver.quit();
        driver = null;
    }
}
