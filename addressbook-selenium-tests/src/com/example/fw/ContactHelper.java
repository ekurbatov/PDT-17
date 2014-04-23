package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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
		index = index + 1;
		click(By.xpath("//tr[" + (index + 1) + "]/td[7]/a/img"));
	}

	public void submitContactModification() {
	    click(By.name("update"));
	}

	public void submitContactRemoval() {
	    click(By.xpath("//input[@value='Delete']"));
	}

	
	public List<ContactData> getContacts() {
		List<ContactData> contacts = new ArrayList<ContactData>();
		List<WebElement> contactEntries = driver.findElements(By.name("selected[]"));
		for (WebElement contactEntry : contactEntries) {
			ContactData contact = new ContactData();
			String title = contactEntry.getAttribute("title");
			contact.firstname = title.substring(title.indexOf("(") + 1, title.indexOf(' ',title.indexOf("(")));
			contact.lastname = title.substring(title.indexOf(' ',title.indexOf("(")) + 1, title.length() - 1);
			contacts.add(contact);
		}
		return contacts;
	}

}
