package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonBase {

	public static WebDriver driver;
	
	public static void browserlaunch()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	public static void maxi() {
		driver.manage().window().maximize();
	}
	public AmazonBase() {
   	 PageFactory.initElements(driver,this);
    }
	
	
	 @FindBy(id="twotabsearchtextbox")
     private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	public void setSearch(WebElement search) {
		this.search = search;
	}
	
	 @FindBy(id="nav-search-submit-button")
     private WebElement searchBtn;

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}

	 @FindBy(xpath="//*[contains(text(),'Apple iPhone 14 Plus (128 GB) - Blue')]")
		
	 private WebElement clickLink;

	public WebElement getClickLink() {
		return clickLink;
	}
	public void setClickLink(WebElement clickLink) {
		this.clickLink = clickLink;
	}
	
	 @FindBy(id="add-to-cart-button")
	 private WebElement addCart;
	 
	public WebElement getAddCart() {
		return addCart;
	}
	public void setAddCart(WebElement addCart) {
		this.addCart = addCart;
	}
	public static void sendValue(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void clickBtn(WebElement element) {
		element.click();
	}
}
