package DemowobShop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shaik\\Downloads\\selinium extenstion\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.navigate().to("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("atest@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("123456");
	}

}
