import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Log {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\RAIL\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
}