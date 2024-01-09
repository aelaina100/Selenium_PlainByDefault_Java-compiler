package seleniumProgramsPkg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class N_ActionsClass {

	public static void main(String[] args) {
		
	       //**************************************************************************************
        // On the Amazon website, simply hover the mouse over:  Hello Sign in                  *
        //                                                      Account & Lists                *
        //                  and then do a right-click AKA context click                                               *
        //**************************************************************************************
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Third_Party_Browsers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.ca/");
		
		Actions a= new Actions(driver);
		WebElement element= driver.findElement(By.id("nav-link-accountList"));
		a.moveToElement(element).contextClick().build().perform();

	}

}
