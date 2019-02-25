package com.automation.page;

import com.automation.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {

  public WebDriver driver = WebDriverFactory.getDriver();

  public abstract void open();


}
