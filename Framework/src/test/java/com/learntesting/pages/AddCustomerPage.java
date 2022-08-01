package com.learntesting.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;

	public AddCustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@href='addcustomerpage.php']")
	WebElement dash;

	@FindBy(xpath = "//input[@name='name']")
	WebElement Cname;

	@FindBy(xpath = "//input[@value='m']")
	WebElement male;

	@FindBy(xpath = "//input[@id='dob']")
	WebElement Dob;

	@FindBy(xpath = "//textarea[@name='addr']")
	WebElement Addr;
	@FindBy(xpath = "//input[@name='city']")
	WebElement City;

	@FindBy(xpath = "//input[@name='state']")
	WebElement State;

	@FindBy(xpath = "//input[@name='pinno']")
	WebElement Pinno;

	@FindBy(xpath = "//input[@name='telephoneno']")
	WebElement Telephoneno;

	@FindBy(xpath = "//input[@name='emailid']")
	WebElement Emailid;

	@FindBy(xpath = "//input[@name='password']")
	WebElement Password;

	@FindBy(xpath = "//input[@value='Submit']")
	WebElement Submit1;

	public void clickAddNewCustomer() {
		dash.click();

	}

	public void custName(String cname) {
		Cname.sendKeys(cname);

	}

	public void custgender(String cgender) {
		male.click();
	}

	public void custdob(String DateOfBirth) throws InterruptedException {
		Dob.sendKeys(DateOfBirth);

	}
	/*
	 * public void custdob(String mm, String dd, String yy) { txtdob.sendKeys(mm);
	 * txtdob.sendKeys(dd); txtdob.sendKeys(yy);
	 * 
	 * }
	 */

	public void custaddress(String caddress) {
		Addr.sendKeys(caddress);
	}

	public void custcity(String ccity) {
		City.sendKeys(ccity);
	}

	public void custstate(String cstate) {
		State.sendKeys(cstate);
	}

	public void custpinno(String cpinno) {
		Pinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno) {
		Telephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) {
		Emailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) {
		Password.sendKeys(cpassword);
	}

	public void custsubmit() {
		Submit1.click();
	}

}
