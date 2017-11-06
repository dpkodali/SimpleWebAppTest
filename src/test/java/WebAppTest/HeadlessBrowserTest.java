package WebAppTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.asserts.Assertion;



public class HeadlessBrowserTest 
{
	@Test
	public void verifySimplWebAppTitle()
	{
		
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://ec2-34-227-96-149.compute-1.amazonaws.com:8080/SimpleWebApp/productList");
		System.out.println("Opened Page: "+driver.getTitle());
		String Page_title=driver.getTitle();
		
		Assert.assertTrue(Page_title.contains("Product List"));
		

	}
	
	@Test
	public void verifySimplWebAppTitleFail()
	{
		
		WebDriver driver=new HtmlUnitDriver();
		driver.get("http://ec2-34-227-96-149.compute-1.amazonaws.com:8080/SimpleWebApp/productList");
		System.out.println("Opened Page: "+driver.getTitle());
		String Page_title=driver.getTitle();
		
		Assert.assertTrue(Page_title.contains("Failed List"));
		

	}
	
}

