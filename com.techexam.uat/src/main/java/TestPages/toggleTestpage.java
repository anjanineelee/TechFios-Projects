package TestPages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import TestBase.Testbase;

public class toggleTestpage extends Testbase{


	@FindBy(name="allbox")
	WebElement Toggleall;
	@FindBy(name="todo[3]")
	WebElement todo3;
	@FindBy(name="todo[2]")
	WebElement todo2;
	@FindBy(name="todo[13]")
	WebElement todo1;
	@FindBy(name="todo[12]")
	WebElement todo4;
	@FindBy(name="todo[11]")
	WebElement todo5;
	@FindBy(name="todo[10]")
	WebElement todo6;
	@FindBy(name="todo[7]")
	WebElement todo7;
	@FindBy(name="todo[8]")
	WebElement todo8;
	@FindBy(name="todo[9]")
	WebElement todo9;
	@FindBy(name="submit")
	WebElement remove;
	@FindBy(xpath="/html/body/div[3]/input[2]")
	WebElement complete;
	// every testpage need a constructor with pagefactory if not its not POM

	public  toggleTestpage()// constructor is used to initialize the values and methods
	{

		PageFactory.initElements(driver, this);
		//pagefactory is a class and initelments is a method and driver is coming from testbase
		// this is the keyword and what ever we are writing its an object in that class 
		//pagefactory is a container in that container we have method initelements that is resposnible to call our webelemnents
		//like togo 1,togo 2 
		// driver will invoke the elements in web when we run 
	}



	

	public void ValidateChecks() {
		Toggleall.click();
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox : checkboxes)
		{

			
			if (checkbox.getAttribute("selected").equals("true")) 
			{
				System.out.println("check passed "+ checkbox.getAttribute("name"));			
			}
			else
			{
				System.out.println("its failed " + checkbox.getAttribute("name"));
			}

		}

	}


	
	public void validateRemove() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		String test = "Y";
// checkbox is holding all the webelements
		for(WebElement checkbox : checkboxes)
		{
			if(test == "Y") {
				checkbox.click();	
				String myremove = checkbox.getAttribute("name");
				remove.click();
				System.out.println("REmoved this check box"+ myremove);
				test = "N";

			}


		}

	}

	public void validateRemoveAll() {
		// this will get the list of all the checkboxes

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));


		// Select all the list of check boxes

		Toggleall.click();	
		// print all the names of all the checkboxes.		
		for(WebElement checkbox : checkboxes) {
			System.out.println("list of Items avaible "+ checkbox.getAttribute("name"));
			
		}
		//Remove all the seleted checkboxes

		remove.click();
		// Gets a new list of check boxes
		System.out.println("Checking the removed items");
		List<WebElement> checkboxes1 = driver.findElements(By.xpath("//input[@type='checkbox']"));

		for(WebElement checkbox : checkboxes1) {
			if(checkbox.getAttribute("name")!="allbox")
			{
				System.out.println("This item is not removed"+ checkbox.getAttribute("name"));
			}


		}

		
	}




}

