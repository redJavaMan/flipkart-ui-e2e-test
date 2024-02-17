package com.flipkart.pages;

import com.google.common.collect.Iterators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.Set;

public class ProductPage {
    private WebDriver driver;
    private Set<String> handles;
    private Iterator<String> it;
    private String parentWindow;
    private String childWindow;
    private String child2Window;
    private By add2CartButton=By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");

    public ProductPage(WebDriver driver) {
        this.driver=driver;
    }
    public void switch2Window(String window){
        handles = driver.getWindowHandles();
        it=handles.iterator();
        parentWindow = it.next();
        childWindow= it.next();
        //child2Window=it.next();
        if (window.equals("parent")){
            driver.switchTo().window(parentWindow);
        } else if (window.equals("child")) {
            driver.switchTo().window(childWindow);
        }
        else {
            driver.switchTo().window(child2Window);
        }
    }
    public void switchToWindow(String window){
        handles = driver.getWindowHandles();
        it=handles.iterator();
        parentWindow = it.next();
        childWindow= it.next();
        child2Window=it.next();
        if (window.equals("parent")){
            driver.switchTo().window(parentWindow);
        } else if (window.equals("child")) {
            driver.switchTo().window(childWindow);
        }
        else if (window.equals("child2")){
            driver.switchTo().window(child2Window);
        }
    }
    public void navigate(String navigation){
        if (navigation.equals("back")) {
            driver.navigate().back();
        } else if (navigation.equals("forward")) {
            driver.navigate().forward();
        }
    }


    public Add2CartPage addToCart(){
        driver.findElement(add2CartButton).click();
        return new Add2CartPage(driver);
    }

}
