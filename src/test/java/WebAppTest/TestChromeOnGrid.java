package WebAppTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestChromeOnGrid {
	@Test
	public void test1() throws MalformedURLException{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "D:\\Profiles\\Durga\\Downloads\\chromedriver_win32\\chromedriver.exe");
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setPlatform(Platform.XP);
		URL url=new URL("http://ec2-34-224-214-70.compute-1.amazonaws.com:4444/wd/hub");
		WebDriver driver=new RemoteWebDriver(url, cap);
		//WebDriver driver=new ChromeDriver
	    driver.get("http://ec2-34-227-96-149.compute-1.amazonaws.com:8080/SimpleWebApp/");
	    System.out.println("Title from chrome "+driver.getTitle());
	    driver.quit();
	}
	

}

