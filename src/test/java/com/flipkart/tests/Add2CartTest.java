package com.flipkart.tests;

import com.flipkart.base.BaseTest;

import com.flipkart.pages.Add2CartPage;
import com.flipkart.pages.ProductListPage;
import com.flipkart.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Add2CartTest extends BaseTest {


    @Test
    public void add2CartTest() throws InterruptedException {
        ProductListPage productListPage = homePage.search("Samsung A54");
        ProductPage productPage=productListPage.selectProduct("SAMSUNG Galaxy A54 5G (Awesome Violet, 256 GB)");
        productPage.switch2Window("child");
        Add2CartPage add2CartPage=productPage.addToCart();
        Assert.assertEquals(add2CartPage.verifyProduct(),"SAMSUNG Galaxy A54 5G (Awesome Violet, 256 GB)","Product Mismatch !!!");
       Assert.assertEquals(add2CartPage.increaseQuantity(3),"3","Quantity Mis Match !!!");
        Assert.assertEquals(add2CartPage.verifyCartPrice(),add2CartPage.getTotalAmount(),"Invalid Total");
    }
    @Test(priority = 1)
    public void addMultipleItem2CartTest() throws InterruptedException {
        ProductListPage productListPage = homePage.search("Samsung A54");
        ProductPage productPage=productListPage.selectProduct("SAMSUNG Galaxy A54 5G (Awesome Violet, 256 GB)");
        productPage.switch2Window("child");
        Add2CartPage add2CartPage=productPage.addToCart();
        productPage.switch2Window("parent");
        productPage.navigate("back");
        homePage.search("Samsung A54");
        productListPage.selectProduct("SAMSUNG Galaxy A54 5G (Awesome Graphite, 128 GB)");
        productPage.switchToWindow("child2");
        Thread.sleep(5000);
        productPage.addToCart();
        Assert.assertEquals(add2CartPage.verifyCartPrice(),add2CartPage.getTotalAmount(),"Invalid Total");
    }
    @Test
    public void MaximumQuantityTest() throws InterruptedException {
        ProductListPage productListPage = homePage.search("Samsung A54");
        ProductPage productPage=productListPage.selectProduct("SAMSUNG Galaxy A54 5G (Awesome Violet, 256 GB)");
        productPage.switch2Window("child");
        Add2CartPage add2CartPage=productPage.addToCart();
        Assert.assertEquals(add2CartPage.verifyProduct(),"SAMSUNG Galaxy A54 5G (Awesome Violet, 256 GB)","Product Mismatch !!!");
        Assert.assertEquals(add2CartPage.increaseQuantity(5),"4","Quantity Mis Match !!!");
        Assert.assertEquals(add2CartPage.getQuantityAlert(),"We're sorry! Only 4 unit(s) allowed in each order","Improper message");
    }

}
