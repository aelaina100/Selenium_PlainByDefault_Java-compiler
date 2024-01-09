package seleniumProgramsPkg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


  // A-  On the Amazon website, Utlizing mouse operations, In the search field type in a word with capital letters and highlight it.
public class M_ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		//WebDriver driver= new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Third_Party_Browsers\\geckodriver.exe");
	    WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.amazon.ca/");
		
		Actions a= new Actions (driver);
		WebElement element= driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(element).click().keyDown(Keys.SHIFT).sendKeys("text").click().doubleClick().build().perform();
		// Note: double click is in and by itself enough to highlight the text. However; use click and then double click to ENSURE
		  // That the text will be highlighted
		
		
  //B- Clear up the text
		a.moveToElement(element).click().doubleClick().keyDown(Keys.BACK_SPACE).build().perform();

		

	}

}
