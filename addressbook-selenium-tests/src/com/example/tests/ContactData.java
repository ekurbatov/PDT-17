package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address1;
	public String homephone;
	public String mobilephone;
	public String workphone;
	public String email1;
	public String email2;
	public String birthday_day;
	public String birthday_month;
	public String birthday_year;
	public String address2;
	public String phone2;

	public ContactData(String firstname, String lastname,
			String address1, String homephone, String mobilephone,
			String workphone, String email1, String email2,
			String birthday_day, String birthday_month, String birthday_year,
			String address2, String phone2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address1 = address1;
		this.homephone = homephone;
		this.mobilephone = mobilephone;
		this.workphone = workphone;
		this.email1 = email1;
		this.email2 = email2;
		this.birthday_day = birthday_day;
		this.birthday_month = birthday_month;
		this.birthday_year = birthday_year;
		this.address2 = address2;
		this.phone2 = phone2;
	}
	
	public ContactData() {
	}
	
}