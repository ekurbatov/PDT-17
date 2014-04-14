package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() throws Exception {
	app.getNavigationHelper().openMainPage();
    app.getContactHelper().initContactCreation();
    ContactData contact = new ContactData();
    contact.firstname = "FirstName1";
    contact.lastname = "LastName1";
    contact.address1 = "Address1";
    contact.homephone = "11111";
    contact.mobilephone = "22222";
    contact.workphone = "33333";
    contact.email1 = "xxx@xxx.xx";
    contact.email2 = "yyy@yyy.yy";
    contact.birthday_day = "1";
    contact.birthday_month = "January";
    contact.birthday_year = "1980";
    contact.address2 = "Address2";
    contact.phone2 = "4444";
    app.getContactHelper().fillContactForm(contact);
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToMainPage();
  }

}