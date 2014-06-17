package com.example.tests;

public class ContactData implements Comparable<ContactData> {
	public String firstname;
	public String lastname;
	public String address1;
	public String phonehome1;
	public String phonemobile;
	public String phonework;
	public String email1;
	public String email2;
	public String birthday;
	public String birthmonth;
	public String birthyear;
	public String groupofcontact;
	public String address2;
	public String phonehome2;
	
	public ContactData() {
	}

	public ContactData(String firstname, String lastname, String address1,
			String phonehome1, String phonemobile, String phonework,
			String email1, String email2, String birthday, String birthmonth,
			String birthyear, String groupofcontact, String address2,
			String phonehome2) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address1 = address1;
		this.phonehome1 = phonehome1;
		this.phonemobile = phonemobile;
		this.phonework = phonework;
		this.email1 = email1;
		this.email2 = email2;
		this.birthday = birthday;
		this.birthmonth = birthmonth;
		this.birthyear = birthyear;
		this.groupofcontact = groupofcontact;
		this.address2 = address2;
		this.phonehome2 = phonehome2;
	}

	@Override
	public String toString() {
		return "ContactData [f_name=" + firstname + ", l_name=" + lastname + ", email1=" + email1 + "]";
		/*return "ContactData [firstname=" + firstname + ", lastname=" + lastname + ", address1=" + address1 
				+ ", phonehome1=" + phonehome1 + ", phonemobile=" + phonemobile + ", phonework=" + phonework 
				+ ", email1=" + email1 + ", email2=" + email2
				+ ", birthday=" + birthday + ", birthmonth=" + birthmonth + ", birthyear=" + birthyear 
				+ ", groupofcontact=" + groupofcontact + ", address2=" + address2 + ", phonehome2=" + phonehome2 + "]";*/
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
	//	result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) 
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactData other = (ContactData) obj;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		return true;
	}

	@Override
	public int compareTo(ContactData other) {
		return this.firstname.toLowerCase().compareTo(other.firstname.toLowerCase());
	}
}