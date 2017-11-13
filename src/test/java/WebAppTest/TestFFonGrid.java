package WebAppTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestFFonGrid {
	@Test
	public void test1() throws MalformedURLException{
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setPlatform(Platform.XP);
		URL url=new URL("http://ec2-34-224-214-70.compute-1.amazonaws.com:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
	    driver.get("http://ec2-34-227-96-149.compute-1.amazonaws.com:8080/SimpleWebApp/");
	    System.out.println("Title from firefox "+driver.getTitle());
	    driver.quit();
	}
	

}
