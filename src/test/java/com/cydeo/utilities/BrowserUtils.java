package com.cydeo.utilities;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils
{
    public static void sleep(int seconds){ // this method will stop execution for given number of seconds
        try {
            Thread.sleep(seconds + 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void verifyTitle( String expectedTitle){
        Assert.assertEquals(Driver.getDriver().getTitle(), expectedTitle);
    }

    public static void switchWindowAndVerifyTitle( String expectedUrl, String expectedTitle){

        //return all the window handles as a set
        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();

        for (String eachHandle : allWindowHandles){

            Driver.getDriver().switchTo().window(eachHandle);
            System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());

            if (Driver.getDriver().getCurrentUrl().contains(expectedUrl)){
                break;
            }
        }
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
    }

    public static void verifiyURL(String expectedURL){
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(expectedURL));
    }

    public static List<String> dropdownOptions_as_STRING(WebElement dropdownElement){

        Select month = new Select(dropdownElement);

        //Storing all the actual options into a List of WebElements
        List<WebElement> options_as_STRING = month.getOptions();

        //Creating an EMPTY list of string to store ACTUAL <option> as a STRING
        List<String> actualOption_as_STRING = new ArrayList<>();

        //Looping through the List<WebElement>,  getting all options' texts, and storing them in List<String>
        for (WebElement each : options_as_STRING){

            actualOption_as_STRING.add(each.getText());

        }

        return actualOption_as_STRING;
    }

    public static void clickRadioButton(List<WebElement> radioButtons, String attributeValue){

        for (WebElement each : radioButtons) {
            if (each.getAttribute("value").equalsIgnoreCase(attributeValue)){
                each.click();
            }
        }
    }

    public static void selectOptionFromDropdown(WebDriver driver, WebElement webElement, String chosenOption) {

        Select select = new Select(webElement);
        select.selectByVisibleText(chosenOption);
    }

}
