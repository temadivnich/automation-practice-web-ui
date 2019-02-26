package com.automation;

import com.automation.driver.WebDriverFactory;
import com.automation.listener.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

@Listeners(TestListener.class)
public class BaseTest {

  protected WebDriver driver = WebDriverFactory.getDriver();

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }
}
