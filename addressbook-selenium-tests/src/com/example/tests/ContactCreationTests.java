package com.example.tests;

import java.util.Collections;
import java.util.List;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

	@Test
	public void testEmptyAddressCreation() throws Exception {
		app.getNavigationHelper().openMainPage();
		
		// save old state
		List<ContactData> oldList = app.getContactHelper().getContacts();

		// actions
		ContactData contact = new ContactData("", "", "", "", "", "", "", "", "-", "-", "", "", "", "");
		app.getContactHelper().initContactCreation();
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactCreation();
		app.getContactHelper().returnToHomePage();
		
		// save new state
		List<ContactData> newList = app.getContactHelper().getContacts();
		
		// compare states
		oldList.add(contact);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}

	@Test
	public void testNonEmptyAddressCreation() throws Exception {
		app.getNavigationHelper().openMainPage();

		// save old state
		List<ContactData> oldList = app.getContactHelper().getContacts();
		
		// actions
		ContactData contact = new ContactData();
		app.getContactHelper().initContactCreation();
		contact.firstname = "Andry3";
		contact.lastname = "Bokov3";
		contact.address1 = "Smolensk";
		contact.phonehome1 = "1234567890";
		contact.phonemobile = "0123456789";
		contact.phonework = "9012345678";
		contact.email1 = "a.bokov3@somewhere.org";
		contact.email2 = "a.bokov3@nowhere.org";
		contact.birthday = "11";
		contact.birthmonth = "January";
		contact.birthyear = "1985";
		contact.groupofcontact = "Group 1";
		contact.address2 = "Universe";
		contact.phonehome2 = "7777777777";
		app.getContactHelper().fillContactForm(contact);
		app.getContactHelper().submitContactCreation();
		app.getContactHelper().returnToHomePage();
		
		// save new state
		List<ContactData> newList = app.getContactHelper().getContacts();
		
		// compare states
		oldList.add(contact);
		Collections.sort(oldList);
		assertEquals(newList, oldList);
	}
}