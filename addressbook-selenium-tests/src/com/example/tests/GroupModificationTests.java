package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {

@Test

public void modifySomeGroup() {
	app.getNavigationHelper().openMainPage();
	app.getGroupHelper().gotoGroupsPage();
	app.getGroupHelper().initGroupModification(3);
	GroupData group = new GroupData();
	group.footer = "new_footer";
	app.getGroupHelper().fillGroupForm(group);
	app.getGroupHelper().submitGroupModification();
	app.getGroupHelper().returnToGroupPage();
	}
}
