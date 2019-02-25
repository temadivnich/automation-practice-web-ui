package com.automation.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage extends BasePage {

  @FindBy(id = "email")
  private WebElement inputEmailAdress;

  @FindBy(id = "passwd")
  private WebElement inputPassword;

  @FindBy(id = "login_form")
  private WebElement loginForm;

  @FindBy(id = "SubmitLogin")
  private WebElement buttonSignIn;

  private String pageUrl = "http://automationpractice.com/index.php?" +
          "controller=authentication&back=my-account";

  @Override
  public void open() {
    driver.get(pageUrl);
    try {
      TimeUnit.SECONDS.sleep(2);
    } catch (InterruptedException e) { }
  }

  public void inputEmail(String email) {
    inputEmailAdress = driver.findElement(By.id("email"));

    inputEmailAdress.click();
    inputEmailAdress.sendKeys(email);
  }

  public void inputPassword(String password) {
    inputPassword = driver.findElement(By.id("passwd"));
    inputPassword.click();
    inputPassword.sendKeys(password);
  }

  public void loginToMyAccount() {
    inputEmail("tema@gmail.com");
    inputPassword("tema@gmail.com");

    buttonSignIn = driver.findElement(By.id("SubmitLogin"));
    buttonSignIn.click();
  }


}
