package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TryCloudStory3 {


    public TryCloudStory3() {

        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy (xpath = "//ul[@id='appmenu']//a")
    public List<WebElement> dashboardDropDown;






}
