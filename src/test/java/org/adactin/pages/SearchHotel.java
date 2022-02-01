package org.adactin.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends BaseClass {
	public SearchHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotelLocation;
	
	@FindBy(name ="room_type")	
	private WebElement roomType;
	
	@FindBy(name="room_nos")
	private WebElement roomNum;
	
	@FindBy(name="datepick_in")
	private WebElement inDate;
	
	@FindBy(name="datepick_out")
	private WebElement outDate;
	
	@FindBy(name="adult_room")
	private WebElement adult;
	
	@FindBy(name="child_room")
	private WebElement child;
	
	@FindBy(name="Submit")
	private WebElement search;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement btn;
	
	@FindBy(name="continue")
	private WebElement radioContinue;
	
	public WebElement dropDownLocation() {
		return location;
	}
	
	public WebElement dropDownHotel() {
		return hotelLocation;
	}
	
	public WebElement dropDownRoomType() {
		return roomType;
	
	}
	public WebElement dropDownRoomNum() {
		return roomNum;
		
	}
	public WebElement checkInDate() {
		return inDate;
		
	}
	public WebElement checkOutDate() {
		return outDate;
		
	}
	public WebElement adultNum() {
		return adult;
		
	}
	public WebElement childNum() {
		return child;
		
	}
	public WebElement btnSearch() {
		return search;
		
	}
	public WebElement radioBtn() {
		return btn;
		
	}
	public WebElement radioContinue() {
		return radioContinue;

	}
	
		
	

}
