package com.flipkart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Add2CartPage {
    private WebDriver driver;
    private By quantityAlert=By.xpath("//div[@class='_2sKwjB']");
    private By price=By.xpath("//span[@class='_2-ut7f _1WpvJ7']");
    private By checkProduct=By.xpath("//a[@class='_2Kn22P gBNbID']");
    private By totalAmount=By.xpath("//div[@class='z4Ha90']");
    private By quantityIncreaseButton=By.xpath("(//button[@class='_23FHuj'])[2]");
    private By quatityText=By.xpath("//div[@class='_26HdzL']/child::input");
    public Add2CartPage(WebDriver driver) {
        this.driver=driver;
    }
    public int getTotalAmount(){
        String f=driver.findElement(totalAmount).getText();
        String q=f.split("₹")[1].replace(",","");
        int s= Integer.parseInt(q);

        return s;
    }
    public String verifyProduct(){
        return driver.findElement(checkProduct).getText();
    }
    public String increaseQuantity(int quantity) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        for (int i=1;i<quantity;i++){
            driver.findElement(quantityIncreaseButton).click();
            Thread.sleep(3000);
        }
        return driver.findElement(quatityText).getAttribute("value");
    }

    public int verifyCartPrice(){
        List<WebElement> total=driver.findElements(price);
        String p;
        int a;
        int t = 0;
        String r;
        for (WebElement amount:total){
            p=amount.getText();
            r = p.split("₹")[1].replace(",","");
            a=Integer.parseInt(r);
            t=t+a;
        }
        return t;
    }
    public String getQuantityAlert(){
        return driver.findElement(quantityAlert).getText();
    }

}
