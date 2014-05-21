package com.example.tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase{
	
  @Test
  public void testNonEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    Data4Group group = new Data4Group();
    group.name = "group name 1";
    group.header = "header 1";
    group.footer = "footer 1";
	fillGroupForm(group);
    submitGroupCreation();
    returnToGroupsPage();
  }

  @Test
  public void testEmptyGroupCreation() throws Exception {
	openMainPage();
    gotoGroupsPage();
    initGroupCreation();
    fillGroupForm(new Data4Group("", "", ""));
    submitGroupCreation();
    returnToGroupsPage();
  }
}