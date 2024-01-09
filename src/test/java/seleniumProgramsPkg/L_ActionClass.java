package seleniumProgramsPkg;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class L_ActionClass {

	// On the Amazon website, Notice that- As a surfer, you can hover the mouse over the search field then click on it so that cursor blinks inside it
	 //, then click-hold on the SHIFT button and enter the text of 'hello' (Once again as a user you can perform that. So: Automate this.)
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.ca/");
		Actions a= new Actions(driver);
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		
		a.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	}

}
