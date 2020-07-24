package policytraydotcom.policytray;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import policytray.xpath;

public class runimp extends browser
{
	xpath x;
	@Given("^:When you click on applyonline in policytray url$")
	public void when_you_click_on_applyonline_in_policytray_url() throws Throwable 
	{
	browser.driver("firefox");
	driver.manage().window().maximize();
	}

	@When("^:Enter all fields in the apply online page$")
	public void enter_all_fields_in_the_apply_online_page() throws Throwable 
	{
	x=new xpath();
	x.getApplyonline().click();
	x.getFirstname().sendKeys("Prakash");
	x.getLastname().sendKeys("Alagappan");
	browser.elev(x.getDate(),"04");
	browser.elev(x.getMonth(),"03");
	browser.elev(x.getYear(),"1987");
	browser.elev(x.getGender(),"Male");
	x.getAddress().sendKeys("1467,Garden Avenue,Mogappair,Chennai-37");
	browser.elev(x.getCity(),"62");
	x.getMobile().sendKeys("7010814908");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	x.getEmail().sendKeys("prakashfrenz@gmail.com");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	browser.elev(x.getPlan(),"823");
	Thread.sleep(8000);
	x.getSumassured().sendKeys("10000000");
	Thread.sleep(8000);
	browser.elev(x.getPolicyterm(),"15");
	Thread.sleep(8000);
	browser.elev(x.getPaymentmode(),"1");
	x.getSubmit().click();
	/*browser.ele(x.getDate(),5);
	browser.ele(x.getMonth(),2);
	browser.ele(x.getYear(),10);*/
	
	}

	@Then("^:Details are submitted Sucessfully$")
	public void details_are_submitted_Sucessfully() throws Throwable 
	{
		
	}
	@Given("^:When you click on Maurity Calculator$")
	public void when_you_click_on_Maurity_Calculator() throws Throwable 
	{
	/*FirefoxOptions options = new FirefoxOptions();
	options.setProfile(new FirefoxProfile());
	options.addPreference("dom.webnotifications.enabled", false);
	WebDriver driver = new FirefoxDriver(options);*/
	 x=new xpath();
	 x.getMaturity().click();
	 Thread.sleep(5000);
	 String main=driver.getWindowHandle();
	 System.out.println("Parent Window"+main);
	 System.out.println(driver.getTitle());
	 x.getSumassuredm().sendKeys("10000000");
	 Thread.sleep(5000);
	 x.getCheckplans().click();
	 Thread.sleep(5000);
	// It returns no. of windows opened by WebDriver and will return Set of Strings
	 Set<String> set =driver.getWindowHandles();
	 // Using Iterator to iterate with in windows
	 Iterator<String> itr= set.iterator();
	 while(itr.hasNext()){
	 String child=itr.next();
	 System.out.println(driver.getTitle());
	 if(!main.equalsIgnoreCase(child))
	 {
	 driver.switchTo().window(child);	
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 x.getRecommendedplan().click();
	 x.getMaurityage().sendKeys("33");
	 x.getAnnualinc().sendKeys("50000");
	 browser.ele(x.getMaturitygender(),1);
	 browser.ele(x.getMaturitystatus(),0);
	 x.getGetplan().click();
	 x.getBuyplan().click();
	 x.getDobcal().sendKeys("04-03-1987");
	 x.getDobcal().sendKeys(Keys.ENTER);
	 browser.ele(x.getSmoke(),1);
	 x.getGetmobile().sendKeys("7010814908");
	 x.getGetinsurancequote().click();
	 x.getIcici().click();
	 //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 Thread.sleep(8000);
	 x.getYearlyinc().click();
	 Thread.sleep(8000);
	 x.getInsdob().sendKeys("04/03/1987");
	 Thread.sleep(8000);
	 x.getInsmobile().sendKeys("7010814908");
	 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	 x.getInsemail().sendKeys("prakashfrenz@gmail.com");
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 x.getCheckpremium().click();
	 Thread.sleep(20000);
	 x.getProceed().click();
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	 executor.executeScript("arguments[0].click();",x.getKyc());
	/*WebDriverWait d=new WebDriverWait(driver,30);
	d.until(ExpectedConditions.visibilityOf(x.getKyc()));*/
	 // d.until(ExpectedConditions.presenceOfElementLocated(x.getKyc()));
	  
	   Actions act=new Actions(driver);
	   act.moveToElement(x.getConfirm(), 100,150).click().build().perform();
	   Thread.sleep(8000);
	   x.getConfirstname().sendKeys("Prakash");
	   Thread.sleep(5000);
	   x.getConnext().click();
	   Thread.sleep(5000);
	   x.getMstatus().click();
	   Thread.sleep(5000);
	   x.getPg().click();
	   Thread.sleep(5000);
	   x.getSalaried().click();
	   Thread.sleep(5000);
	   x.getOrganization().sendKeys("HCL Technologies Ltd");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getPvtltd().click();
	   Thread.sleep(5000);
	   x.getPan().sendKeys("BDZPP3103Q");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getAnnuinc().click();
	   Thread.sleep(5000);
	   x.getConfirm1().click();
	   Thread.sleep(5000);
	   x.getNos().click();
	   Thread.sleep(5000);
	   x.getPin().sendKeys("600037");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getSkip().click();
	   Thread.sleep(5000);
	   x.getCity1().sendKeys("Chennai");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getState().sendKeys("TAMIL NADU");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getAddress1().sendKeys("Moagappair");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getYes().click();
	   Thread.sleep(5000);
	   x.getC1().click();
	   Thread.sleep(5000);
	   x.getC1().click();
	   Thread.sleep(5000);
	   x.getNomineefname().sendKeys("Prakash");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getNomineedob().sendKeys("04/03/1987");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getNomineers().click();
	   Thread.sleep(5000);
	   x.getPolicyexist().click();
	   Thread.sleep(10000);
	   x.getNextsection().click();
	   Thread.sleep(5000);
	   x.getWeight().sendKeys("72");
	   Thread.sleep(5000);
	   x.getNextbutton().click();
	   Thread.sleep(5000);
	   x.getFeet().sendKeys("5");
	   Thread.sleep(5000);
	   x.getInches().sendKeys("10");
	   Thread.sleep(5000);
	   x.getNextbtn().click();
	   Thread.sleep(5000);
	   x.getHq().click();
	   Thread.sleep(5000);
	   x.getAlc().click();
	   Thread.sleep(5000);
	   x.getMilt().click();
	   Thread.sleep(5000);
	   x.getHaz().click();
	   Thread.sleep(5000);
	   x.getDiseases().click();
	   Thread.sleep(5000);
	   x.getHealthbutton().click();
	   Thread.sleep(5000);
	   x.getTreatment().click();
	   Thread.sleep(5000);
	   x.getInjury().click();
	   Thread.sleep(5000);
	   x.getInjury().click();
	   Thread.sleep(5000);
	   x.getCovid19().click();
	   Thread.sleep(5000);
	   x.getIsolate().click();
	   Thread.sleep(5000);
	   x.getSelfisolate().click();
	   Thread.sleep(5000);
	   x.getCough().click();
	   Thread.sleep(5000);
	   x.getCloser().click();
	   Thread.sleep(5000);
	   x.getSkip().click();
	   Thread.sleep(5000);
	   x.getUploaddoc().click();
	   Thread.sleep(5000);
	   x.getProceedpayment().click();
	   Thread.sleep(5000);
	   x.getAgree().click();
	 /*JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	 executor1.executeScript("arguments[0].click();",x.getProceed());*/
	//WebDriverWait wait = new WebDriverWait(driver,20);
	//wait.until(ExpectedConditions.invisibilityOf(x.getProceed()));
	//wait.until(ExpectedConditions.elementToBeClickable(x.getProceed()));
	
		/* driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  x.getProceed().click(); */
	  Thread.sleep(8000);
	   /*JavascriptExecutor executor = (JavascriptExecutor)driver;
	   executor.executeScript("arguments[0].click();",x.getKyc());
	   Thread.sleep(5000);
	   x.getConfirstname().sendKeys("Prakash");
	   Thread.sleep(5000);
	   x.getConnext().click();
	   Thread.sleep(5000);
	   x.getMstatus().click();
	   Thread.sleep(5000);
	   x.getPg().click();
	   Thread.sleep(5000);
	   x.getSalaried().click();
	   Thread.sleep(5000);
	   x.getOrganization().sendKeys("HCL Technologies Ltd");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getPvtltd().click();
	   Thread.sleep(5000);
	   x.getPan().sendKeys("BDZPP3103Q");
	   Thread.sleep(5000);
	   x.getNexxt().click();
	   Thread.sleep(5000);
	   x.getAnnuinc().click();
	   Thread.sleep(5000);
	   x.getConfirm1().click();
	   Thread.sleep(5000);
	   x.getNos().click();
	   Thread.sleep(5000);
	   x.getPin().sendKeys("600037");
	   Thread.sleep(5000);
	   x.getNexxt().click();*/
	 }
	 }
	 /*
	 driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	 x.getRecommendedplan().click();*/
	 
	 /*Thread.sleep(8000);
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click();",x.getRecommendedplan());
	 x.getRecommendedplan().click();
	 x.getMaurityage().sendKeys("33");
	 x.getAnnualinc().sendKeys("2134895");
	 browser.elev(x.getMaturitygender(),"M");
	 browser.elev(x.getMaturitystatus(),"S");*/
	 
	}

	@When("^:Enter sum assured and click on  plans details$")
	public void enter_sum_assured_and_click_on_plans_details() throws Throwable 
	{
	   
	}

	@Then("^:Car,(\\d+)Wheeler and Term Insurance displayed$")
	public void car_Wheeler_and_Term_Insurance_displayed(int arg1) throws Throwable 
	{
	   
	}

	@Then("^:Click on Terms Insurance$")
	public void click_on_Terms_Insurance() throws Throwable 
	{
	  
	}



}
