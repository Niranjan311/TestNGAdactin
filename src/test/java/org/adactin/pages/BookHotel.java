package org.adactin.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel extends BaseClass {
	public BookHotel() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(name="first_name")
	private WebElement txtFirst;
	
	public WebElement firstName() {
		return txtFirst;
	
	}
	@FindBy(name="last_name")
	private WebElement txtLast;
	
	public WebElement lastName() {
		return txtLast;
		
	}
	@FindBy(name="address")
	private WebElement address;
	
	public WebElement address() {
		return address;
		
	}
	@FindBy(name="cc_num")
	private WebElement card;
	
	public WebElement cardNum() {
		return card;		

	}
	@FindBy(name="cc_type")
	private WebElement ccType;
	
	public WebElement cardType() {
		return ccType;		

	}
	@FindBy(name="cc_exp_month")
	private WebElement month;
	
	public WebElement expiryMonth() {
		return month;		

	}
	@FindBy(name="cc_exp_year")
	private WebElement year;
	
	public WebElement expiryYear() {
		return year;		

	}
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	
	public WebElement security() {
		return cvv;		

	}
	@FindBy(name="book_now")
	private WebElement book;
	
	public WebElement bookNow() {
		return book;		

	}
	@FindBy(name="order_no")
	private WebElement order;
	
	public WebElement orderNum() {
		return order;		

	}
	

}
