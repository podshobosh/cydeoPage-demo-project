package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ViewAllOrdersPage {

    public ViewAllOrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//tr[1]/td[1]")
    public WebElement orderName;

    @FindBy(xpath = "//button[.='Select All']")
    public WebElement selectAllBttn;

    @FindBy(xpath = "//button[.='Deselect All']")
    public WebElement deselectAllBttn;

    @FindBy(xpath = "//button[@class='button __delete __inactive']")
    public WebElement deleteSelectedBttn;

    @FindBy(xpath = "//button[@class='button __select']")
    public List <WebElement> allCheckboxes;



}