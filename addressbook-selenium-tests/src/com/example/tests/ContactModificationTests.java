package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

	@Test
	public void modifySomeContact() {
		app.getNavigationHelper().openMainPage();
	    app.getContactHelper().initContactModification(1);
	    ContactData contact = new ContactData();
	    contact.firstname = "Sergey";				// to verify how fillGroupForms works
	    app.getContactHelper().fillContactForm(contact);
	    app.getContactHelper().submitContactModification("Update");
	    app.getContactHelper().return2HomePage();
	}
}