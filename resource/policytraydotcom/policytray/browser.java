package policytraydotcom.policytray;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.Select;

public class browser 
{
public static WebDriver driver;//GITHUB
public static WebDriver driver(String ele)
{
if(ele.equalsIgnoreCase("chrome"))
{
System.setProperty("webdriver.chrome.driver","E:\\Selenium\\Selenium\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
}
if(ele.equalsIgnoreCase("firefox"))
{
System.setProperty("webdriver.gecko.driver","E:\\Selenium\\Selenium\\Driver\\geckodriver.exe");
//driver=new FirefoxDriver();
FirefoxOptions options = new FirefoxOptions();
options.setProfile(new FirefoxProfile());
options.addPreference("dom.webnotifications.enabled",false);
driver = new FirefoxDriver(options);
}
else
{
System.out.println("No Browser Present");		
}
driver.get("https://policytray.com/");
return driver;
}
public static void ele(WebElement ele,int i)
{
Select sel=new Select(ele);
sel.selectByIndex(i);
}
public static void elev(WebElement ele,String s)
{
Select sel=new Select(ele);
sel.selectByValue(s);
}
}
