package seleniumProgramsPkg;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// Navigate to Amazon and click on "Returns and Orders" while holding down the 'Shift' button (This is to render a child window opened up/launched)
public class O_ChildWindow {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.ca/");
		
		Actions a= new Actions(driver);
		WebElement element_returnsOrders= driver.findElement(By.id("nav-orders"));
		a.moveToElement(element_returnsOrders).keyDown(Keys.SHIFT).click().build().perform();
		
		//Now, I want to finish automating on the child window that has just been launched,
		 // So, I need to first swich my driver from the original parent window and onto the child window. To do so:
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		String parentWindowHandleId= it.next();
		String childWindowHandleId= it.next();
		
		driver.switchTo().window(childWindowHandleId);  // Driver has been switched to the child window
		
		driver.findElement(By.id("ap_email")).sendKeys("SomeRandomEmail@randomness.com"); //enters email adress.
		driver.findElement(By.id("continue")).click();  // clicks on the 'continue button'.
		
		// Below: Now, on the original parent window- Click on 'Best Sellers' button
		driver.switchTo().window(parentWindowHandleId); // for later: why not :driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Best Sellers")).click();
		
		// Below: On this same original parent window- click on 'Deals Store' while holding the 'Shift' key down
		// so that a sub child window pops-up
		WebElement element_dealsStore= driver.findElement(By.linkText("Deals Store"));
		a.moveToElement(element_dealsStore).keyDown(Keys.SHIFT).click().build().perform();
		Thread.sleep(3000L);
		
		
		//On this sub child window, hover mouse over 'Prime' so that a green preview appears (as of this date)
		 // so first, I have to switch my driver from my current child window (where its currently at) and onto this sub sub-child window
		 
		 String x= it.next(); // causing error !
		 
		 System.out.println(parentWindowHandleId);
		 System.out.println(childWindowHandleId);
		 System.out.println(x);
		 
		//driver.switchTo().window(subChildWindowHandleId);
		driver.switchTo().window(x);
		
		
		driver.findElement(By.linkText("Gift ideas")).click();  // Using LinkText is not going to work here (review <HTML code>, 
		  // Instead, Text can only be used in text xpath.
		
		
		//Thread.sleep(6000L);
		//driver.quit();
		
		
		
		
		
		

	}

}
