package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

public class ProductListPage {
    private WebDriver driver;

    public ProductListPage(WebDriver driver) {
        this.driver=driver;
    }

    public ProductPage selectProduct(String model){
        List<WebElement> products = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        for (WebElement product:products){
            if(product.getText().contains(model)){
                product.click();
            }
        }
        return new ProductPage(driver);
    }

}
