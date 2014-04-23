package com.example.tests;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.example.fw.ApplicationManager;

public class TestBase {
	
//  protected ApplicationManager app;	
	static ApplicationManager app;

@BeforeTest
	public void setUp() throws Exception {
		app = new ApplicationManager();
	  }
	
@AfterTest
	public void tearDown() throws Exception {
		app.stop();
	  }

@DataProvider
public Iterator<Object[]> randomValidGroupGenerator() {
	  List<Object[]> list = new ArrayList<Object[]>();
	  for (int i = 0; i < 5; i++) {
		  GroupData group = new GroupData();
		  group.groupname = GenerateRandomString();
		  group.header = GenerateRandomString();
		  group.footer = GenerateRandomString();
		  list.add(new Object[]{group});
	  }
	  return list.iterator();
}

@DataProvider
public Iterator<Object[]> randomValidContactGenerator() {
	  List<Object[]> list = new ArrayList<Object[]>();
	  for (int i = 0; i < 2; i++) {
		  ContactData contact = new ContactData();
		    contact.firstname = GenerateRandomString();
		    contact.lastname = GenerateRandomString();
		    contact.address1 = GenerateRandomString();
		    contact.homephone = GenerateRandomDigit();
		    contact.mobilephone = GenerateRandomDigit();
		    contact.workphone = GenerateRandomDigit();
		    contact.email1 = GenerateRandomMail();
		    contact.email2 = GenerateRandomMail();
		    contact.birthday_day = GenerateRandomDay();
		    contact.birthday_month = GenerateRandomMonth();
		    contact.birthday_year = GenerateRandomYear();
		    contact.address2 = GenerateRandomString();
		    contact.phone2 = GenerateRandomDigit();
		  list.add(new Object[]{contact});
	  }
	  return list.iterator();
}




public String GenerateRandomString() {
	  Random rnd = new Random();
	  if (rnd.nextInt(3) == 0) {
		  return "test0";
	  }
	  else { 
		  return "test" + Math.abs(rnd.nextInt());
	  }
}

public String GenerateRandomDigit() {
	  Random rnd = new Random();
	  if (rnd.nextInt(3) == 0) {
		  return "000";
	  }
	  else { 
		  return Math.abs(rnd.nextInt())+"";
	  }
}

public String GenerateRandomMail() {
		  return GenerateRandomString()+"@"+GenerateRandomString()+".com";
}

public String GenerateRandomDay() {
	Random rnd = new Random();
	int minDay=1;
	int maxDay=28;
	int randomDay = rnd.nextInt(maxDay-minDay) + minDay;
	return randomDay + "";
}

public String GenerateRandomMonth() {
	Random rnd = new Random();
	ArrayList<String> month = new ArrayList<String>();
	month.add("January");
	month.add("February");
	month.add("March");
	month.add("April");
	month.add("May");
	month.add("June");
	month.add("July");
	month.add("August");
	month.add("September");
	month.add("October");
	month.add("November");
	month.add("December"); 
	int randomMonth = rnd.nextInt(11);
	return month.get(randomMonth); 
}

public String GenerateRandomYear() {
	Random rnd = new Random();
	int minYear=1930;
	int maxYear=2014;
	int randomYear = rnd.nextInt(maxYear-minYear) + minYear;
	return randomYear + "";
}

}