package br.ce.barriga.driver;



import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;



public class DriverFactore {

    private static WebDriver driver;

    public DriverFactore(){}


    public static WebDriver getDriver(){
        if(driver == null){
            driver = new ChromeDriver();
        }
        driver.manage().window().setSize(new Dimension(1200, 765));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        return driver;
    }
    public static void killDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}




