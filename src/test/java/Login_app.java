import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_app {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\LENOVO\\eclipse-workspace\\RAIL\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aquib");
		driver.findElement(By.xpath("//input[@name='middleName']")).sendKeys("Ishraque");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Shaikh");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("4215");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	

}
