package com.example.tests;

import org.testng.annotations.Test;

public class AddressCreationTests extends TestBase {
  @Test
  public void testEmptyAddressCreation() throws Exception {
    openMainPage();
    go2AddNewAddressPage();
    fillNewAddressForm(new Data4Contact("", "", "", "", "", "", "", "", "-", "-", "", "", "", ""));
	submitAddressCreation();
    return2HomePage();
  }
  @Test
  public void testNonEmptyAddressCreation() throws Exception {
    openMainPage();
    go2AddNewAddressPage();
    Data4Contact contact = new Data4Contact();
    contact.firstname = "First name 1";
    contact.lastname = "Last Name 1";
    contact.address1 = "Address 1";
    contact.phonehome1 = "Home phone 1";
    contact.phonemobile = "Mobile phone";
    contact.phonework = "Work phone 1";
    contact.email1 = "Email 1";
    contact.email2 = "Email 2";
    contact.birthday = "1";
    contact.birthmonth = "January";
    contact.birthyear = "1985";
    contact.groupofcontact = "Group 1";
    contact.address2 = "Address 5";
    contact.phonehome2 = "Home phone 5";
	fillNewAddressForm(contact);
	submitAddressCreation();
    return2HomePage();
  }
}