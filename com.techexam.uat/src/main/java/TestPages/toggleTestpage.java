package TestPages;

import org.junit.Assert;
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
	@FindBy(name="todo[1]")
	WebElement todo1;
	@FindBy(name="todo[4]")
	WebElement todo4;
	@FindBy(name="todo[5]")
	WebElement todo5;
	@FindBy(name="todo[6]")
	WebElement todo6;
	@FindBy(name="todo[7]")
	WebElement todo7;
	@FindBy(name="todo[8]")
	WebElement todo8;
	@FindBy(name="todo[9]")
	WebElement todo9;
	@FindBy(name="submit")
	WebElement remove;
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
	
	
	public  void verifyToggleall()
	{
		//Toggleall.click();
	
		//boolean ble = todo1.isSelected();
					
		/*if (Toggleall.isSelected()) 
		{
			System.out.println("check passed" );			
		}
		else
		{
			System.out.println("its failed");
		}
		*/
		
		WebElement chkFBPersist = Toggleall;							
        for (int i=0; i<2; i++) {											
            chkFBPersist.click (); 			
            System.out.println("Facebook Persists Checkbox Status is -  "+ chkFBPersist.isSelected());
            todo3.click();
          
        }
	}
	

	
	
	
}
