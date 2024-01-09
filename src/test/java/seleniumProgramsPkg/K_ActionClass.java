package seleniumProgramsPkg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

          //**************************************************************************************
          // On the Amazon website, simply hover the mouse over:  Hello Sign in                  *
          //                                                      Account & Lists                *
          //                  NOW-Automate this !                                                *
          //**************************************************************************************
public class K_ActionClass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.ca/");
		
		Actions a= new Actions(driver);
		WebElement element= driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(element).build().perform();
		
		
		

		
		
		

	}

}
