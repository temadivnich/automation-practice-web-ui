package com.automation;

import com.automation.page.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

  private LoginPage loginPage = new LoginPage();

  @Test
  public void testLogin() {
    loginPage.open();
    loginPage.loginToMyAccount();
    System.out.println(driver.getCurrentUrl());
    System.out.println("Done!!!");
  }
}
