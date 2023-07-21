package com.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseDemo{
	
	public void searchHotel() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="location")
    private WebElement location;
	@FindBy(id="hotels")
    private WebElement hotels;
	@FindBy(id="room_type")
    private WebElement room_type;
	@FindBy(id="room_nos")
    private WebElement room_nos;
	
	@FindBy(id="datepick_in")
    private WebElement datepick_in;
	@FindBy(id="datepick_out")
    private WebElement datepick_out;
	@FindBy(id="adult_room")
    private WebElement adult_room;
	@FindBy(id="child_room")
    private WebElement child_room;
	@FindBy(id="submit")
    private WebElement submit;
	
}
