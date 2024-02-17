package com.flipkart.base;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import org.apache.commons.io.FileUtils;



import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import com.flipkart.pages.HomePage;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeMethod
    public void setup(){
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        homePage=new HomePage(driver);

    }


    public String getScreenShot(String testCaseName,WebDriver driver) throws IOException{
        TakesScreenshot ts=(TakesScreenshot)driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File file=new File(System.getProperty("user.dir")+"//repots//"+testCaseName+".png");
        return System.getProperty("user.dir")+"//repots//"+testCaseName+".png";
    }


    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

}
