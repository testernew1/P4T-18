package com.example.tests;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase {

	@Test
	public void deleteSomeGroup() {
		app.getNavigationHelper().openMainPage();
	    app.getNavigationHelper().gotoGroupsPage();
	    //  deleteGroups() method realized without submission, exactly as application works
	    app.getGroupHelper().deleteGroup(1);
	    app.getGroupHelper().return2GroupsPage();
	}
}