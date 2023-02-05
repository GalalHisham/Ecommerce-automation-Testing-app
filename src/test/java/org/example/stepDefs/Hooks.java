package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    @Before
    public static void OpenBrowser()
    {
        driver = new EdgeDriver();
        //3-Configuration
        //3.1 maximize browser
        driver.manage().window().maximize();

        //3.2 set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //4- Navigate to website
        String url ="https://demo.nopcommerce.com/";
        driver.navigate().to(url);
    }
    @After
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
