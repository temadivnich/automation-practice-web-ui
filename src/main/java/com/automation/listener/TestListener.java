package com.automation.listener;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import static com.automation.driver.WebDriverFactory.getDriver;

public class TestListener implements ITestListener {

  private WebDriver driver = getDriver();

  @Override
  public void onTestFailure(ITestResult result) {
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    try {
      Files.move(screenshot, new File("target/" + result.getMethod().getMethodName() + "_" + LocalDateTime.now() + ".png"));
    } catch (IOException e) {
    }
  }
}
