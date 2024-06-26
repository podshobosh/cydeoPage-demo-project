package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[.='View all orders']")
    public WebElement viewAllOrdersLink;

    @FindBy(xpath = "//button[.='View all products']")
    public WebElement viewAllProductsLink;

    @FindBy(xpath = "//button[.='Order']")
    public WebElement orderLink;

    @FindBy(xpath = "//button[.='Logout']")
    public WebElement logOutBttn;





}
