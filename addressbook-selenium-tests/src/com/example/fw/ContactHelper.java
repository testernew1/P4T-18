package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initContactCreation() {
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"), contact.firstname);
		type(By.name("lastname"), contact.lastname);
		type(By.name("address"), contact.address1);
		type(By.name("home"), contact.phonehome1);
		type(By.name("mobile"), contact.phonemobile);
		type(By.name("work"), contact.phonework);
		type(By.name("email"), contact.email1);
		type(By.name("email2"), contact.email2);
	    selectByText(By.name("bday"), contact.birthday);
	    selectByText(By.name("bmonth"), contact.birthmonth);
		type(By.name("byear"), contact.birthyear);
	    // selectByText(By.name("new_group"), "group 1");	//Later on
		type(By.name("address2"), contact.address2);
		type(By.name("phone2"), contact.phonehome2);
	}

	public void submitContactCreation() {
		click(By.name("submit"));
	}

	public void return2HomePage() {
		click(By.linkText("home"));
	}

	public void initContactModification(int index) {
		selectContactByIndex(index);
	}

	public void submitContactModification(String xbutton) {
		click(By.xpath("//input[@value='"+xbutton+"']"));
	}

	private void selectContactByIndex(int index) {
		int real_i = index + 1;
	    click(By.xpath("//html/body/div/div[4]/form[2]/table/tbody/tr["+real_i+"]/td[7]/a/img")); 
	}
}