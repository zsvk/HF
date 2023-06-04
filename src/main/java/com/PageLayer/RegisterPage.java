package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;
import com.UtilsLayer.HandleDropDown;
import com.UtilsLayer.UtilsClass;

public class RegisterPage extends BaseClass
{	
	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstName")
	WebElement FirstName;
	
	@FindBy(name = "lastName")
	WebElement LastName;

	@FindBy(name = "phone")
	WebElement Phone;

	@FindBy(name = "userName")
	WebElement Email;

	@FindBy(name = "address1")
	WebElement Address;

	@FindBy(name = "city")
	WebElement City;

	@FindBy(name = "state")
	WebElement State;

	@FindBy(name = "postalCode")
	WebElement PostalCode;

	@FindBy(name = "country")
	WebElement Country;

	@FindBy(name = "email")
	WebElement Username;

	@FindBy(name = "password")
	WebElement Password;

	@FindBy(name = "confirmPassword")
	WebElement ConfirmPassword;

	@FindBy(name = "submit")
	WebElement Submit;
	
	public void contactInformation(String fname, String lname, String mob, String email)
	{	UtilsClass.enterDataInTextBox(FirstName, fname);//------------------>use WebElement from @FindBy and value from argument)
		UtilsClass.enterDataInTextBox(LastName, lname);
		UtilsClass.enterDataInTextBox(Phone,mob);
		UtilsClass.enterDataInTextBox(Email,email);
	}
	public void mailingInformation(String add, String city, String state, String pcode, String country)
	{
		UtilsClass.enterDataInTextBox(Address,add);
	
	UtilsClass.enterDataInTextBox(City, city);
	UtilsClass.enterDataInTextBox(State,state);
	UtilsClass.enterDataInTextBox(PostalCode, pcode);
	HandleDropDown.selectValueUsingVisibleText(Country,country);
	
	}
	public void userInformation(String uname, String pass, String cpass)
	{
		UtilsClass.enterDataInTextBox(Username, uname);
		UtilsClass.enterDataInTextBox(Password, pass);
		UtilsClass.enterDataInTextBox(ConfirmPassword, cpass);
		UtilsClass.clickOnButton(Submit);
	}
	
	
	
	
	
	
	
	
}
