package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



public class HomePage {
    private WebDriver driver;
    private By searchField =By.xpath("//input[@title='Search for Products, Brands and More']");
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }
    public ProductListPage search(String product){
        driver.findElement(searchField).sendKeys(product, Keys.ENTER);
        return new ProductListPage(driver);
    }

}
