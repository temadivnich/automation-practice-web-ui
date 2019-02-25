package com.automation;

import com.automation.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class BaseTest {

  WebDriver driver = WebDriverFactory.getDriver();
}
