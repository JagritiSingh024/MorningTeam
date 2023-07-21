package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseDemo{
	
     public LoginPage() {
    	 PageFactory.initElements(driver,this);
     }
     @FindBy(id="username")
     private WebElement username;
     
     public WebElement getUsername() {
		return username; 
     }
     public void setUsername(WebElement username) {
 		this.username = username; 
      }
     @FindBy(id="password")
     private WebElement password;
     
     public WebElement getPassword() {
		return password; 
     }
     public void setPassword(WebElement password) {
 		this.password = password; 
      }
     @FindBy(xpath="//*[@name='login']")
     private WebElement loginBtn;
     
     public WebElement getLoginBtn() {
		return loginBtn; 
     }
     public void setLoginBtn(WebElement loginBtn) {
 		this.loginBtn = loginBtn; 
      }
     
     
}
