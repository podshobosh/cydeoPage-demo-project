package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrderPage
{
    public OrderPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "product")
    public WebElement productDropdown;

    @FindBy(name = "quantity")
    public WebElement quantityInput;

    @FindBy(xpath = "//button[.='Calculate']")
    public WebElement calcBttn;

    @FindBy(name = "name")
    public WebElement nameInput;

    @FindBy(name = "street")
    public WebElement streetAddressInput;

    @FindBy(name = "city")
    public WebElement cityInput;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement stateInput;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement zipInput;

    @FindBy(xpath = "//input[@type='radio']")
    public List<WebElement> radioButtons;

    @FindBy(name = "cardNo")
    public WebElement cardNumInput;

    @FindBy(name = "cardExp")
    public WebElement cardExpInput;

    @FindBy(xpath = "//button[.='Process Order']")
    public WebElement processOrderBttn;

    @FindBy(xpath = "//button[.='Reset Fields']")
    public WebElement t;




}
