package com.example.fw;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.example.tests.GroupData;

public class GroupHelper extends HelperBase {

	public GroupHelper(ApplicationManager manager) {
		super(manager);
	}

	public void initGroupCreation() {
	    click(By.name("new"));
	}

	public void fillGroupForm(GroupData group) {
	    type("group_name", group.groupname);
	    type("group_header", group.header);
	    type("group_footer", group.footer);
	}

	public void submitGroupCreation() {
	    click(By.name("submit"));
	}

	public void gotoGroupsPage() {
	    click(By.linkText("groups"));
	}
	

	public void returnToGroupPage() {
	    click(By.linkText("group page"));
	}

	public void deleteGroup(int index) {
		selectGroupByIndex(index);
		click(By.name("delete"));
		
	}

	public void initGroupModification(int index) {
		selectGroupByIndex(index);
		click(By.name("edit"));
	}
	
	private void selectGroupByIndex(int index) {
		click(By.xpath("//input[@name='selected[]'][" + (index + 1) + "]"));
	}

	public void submitGroupModification() {
	    click(By.name("update"));
	}

	public List<GroupData> getGroups() {
		List<GroupData> groups = new ArrayList<GroupData>();
		List<WebElement> checkboxes = driver.findElements(By.name("selected[]"));
		for (WebElement checkbox : checkboxes) {
			GroupData group = new GroupData();
			String title = checkbox.getAttribute("title");
			group.groupname = title.substring("Select (".length(), title.length() - ")".length());
			groups.add(group);
		}
		
		return groups;
	}


}
