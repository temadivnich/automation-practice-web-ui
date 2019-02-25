package com.automation.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverFactory {

  private static WebDriver driver;

  public static WebDriver getDriver() {
    if (driver == null)
      driver = initChrome();
    return driver;
  }

  private static WebDriver initChrome() {
    System.setProperty("webdriver.chrome.driver", "drivers/macos/chromedriver");

    ChromeOptions chromeOptions = new ChromeOptions();
//    chromeOptions.addArguments("--headless");
//    chromeOptions.addArguments("--disable-gpu");

    return new ChromeDriver(chromeOptions);
  }

}
