package org.adactin.test;

import org.base.BaseClass;
import org.adactin.pages.*;

public class Sample extends BaseClass {
	public static void main(String[] args) {
		launchBrowser("Chrome");
		launchUrl("https://adactinhotelapp.com/index.php");
		implicitWait(30);
		LoginPage l = new LoginPage();
		fillTextBox(l.getTxtUsername(), "Niranjan31");
		fillTextBox(l.getTxtPassword(), "Niranjan@31");
		btnClick(l.getBtnLogin());
		
		SearchHotel sh = new SearchHotel();
		selectByIndex(sh.dropDownLocation(), 5);
		selectByIndex(sh.dropDownHotel(), 4);
		selectByIndex(sh.dropDownRoomType(), 3);
		sh.checkInDate().clear();;
		fillTextBox(sh.checkInDate(), "01/11/2021");
		sh.checkOutDate().clear();
		fillTextBox(sh.checkOutDate(), "03/11/2021");
		btnClick(sh.btnSearch());
		btnClick(sh.radioBtn());
		btnClick(sh.radioContinue());
		
		BookHotel bh = new BookHotel();
		fillTextBox(bh.firstName(), "Niranjan");
		fillTextBox(bh.lastName(), "Kumar");
		fillTextBox(bh.address(), "Chennai");
		fillTextBox(bh.cardNum(), "0123456789147852");
		selectByIndex(bh.cardType(), 2);
		selectByIndex(bh.expiryMonth(), 10);
		selectByValue(bh.expiryYear(), "2022");
		fillTextBox(bh.security(), "123");
		btnClick(bh.bookNow());
		
		String orderNumber = getAttribute(bh.orderNum());
		System.out.println(orderNumber);
		
		
	}

}
