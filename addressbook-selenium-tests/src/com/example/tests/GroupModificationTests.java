package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
	
	@Test
	public void modifySomeGroup() {
		app.getNavigationHelper().openMainPage();		// GroupCreationTests
	    app.getNavigationHelper().gotoGroupsPage();		// GroupCreationTests
	    app.getGroupHelper().initGroupModification(1); 	// GroupHelper
	    GroupData group = new GroupData();
	    group.name = "new name";						// to verify how fillGroupForms works
		app.getGroupHelper().fillGroupForm(group);		// new method
	    app.getGroupHelper().submitGroupModification(); // new method
	    app.getGroupHelper().returnToGroupsPage();		// GroupCreationTests
	}
}
