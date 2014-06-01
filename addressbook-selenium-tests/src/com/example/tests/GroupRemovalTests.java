package com.example.tests;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase {

	@Test
	public void deleteSomeGroup() {
		app.getNavigationHelper().openMainPage();	// GroupCreationTests
	    app.getNavigationHelper().gotoGroupsPage();	// GroupCreationTests
	    //  deleteGroups() method realized without submission, exactly as application works
	    app.getGroupHelper().deleteGroup(1); 		// GroupHelper
	    app.getGroupHelper().returnToGroupsPage();	// GroupCreationTests
	}
}
