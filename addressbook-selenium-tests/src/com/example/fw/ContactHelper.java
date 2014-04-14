package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void fillContactForm(ContactData contact) {
		type("firstname", contact.firstname);
		type("lastname", contact.lastname);
		type("address", contact.address1);
		type("home", contact.homephone);
		type("mobile", contact.mobilephone);
		type("work", contact.workphone);
		type("email", contact.email1);
		type("email2", contact.email2);	
		type("byear", contact.birthday_year);
		type("address2", contact.address2);
		type("phone2", contact.phone2);	
		// selectByText(By.name("new_group"), "group1");
	    selectByText(By.name("bday"), contact.birthday_day);
	    selectByText(By.name("bmonth"), contact.birthday_month);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void initContactModification(int index) {
		index = index +1;
		click(By.xpath("//tr[" + index + "]/td[7]/a/img"));
	}

	public void submitContactModification() {
	    click(By.name("update"));
	}

	public void submitContactRemoval() {
	    click(By.xpath("//input[@value='Delete']"));
	}

}
