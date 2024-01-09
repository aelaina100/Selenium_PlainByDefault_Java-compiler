package seleniumProgramsPkg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q_FrameAction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/iframe");
		
		int numberOfFrames= driver.findElements(By.tagName("iframe")).size();
		System.out.println(numberOfFrames);
		
	    WebElement frameElement= driver.findElement(By.className("tox-edit-area__iframe"));
	    driver.switchTo().frame(frameElement);
		
		//A- Clear the default/Already pre-existing text
	    WebElement textFieldElement= driver.findElement(By.id("tinymce"));
		//textFieldElement.clear();
		
		//or instead, one can utilize mouse actions:
		//Actions a= new Actions(driver);
		//a.moveToElement(textFieldElement).click().keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).keyDown(Keys.BACK_SPACE).build().perform();
// you do not have to keyUp the shift key before pressing on backspace ( while still keying down the shift, backspace button will clear up the text.
		
		
		
		//B- Add a text with capital letters
		Actions b= new Actions(driver);
		b.moveToElement(textFieldElement).click().keyDown(Keys.SHIFT).sendKeys("some capital letters random text").build().perform();
		
		//c- Now highlite the entire text
		
		b.moveToElement(textFieldElement).click().keyDown(Keys.CONTROL).sendKeys("A").build().perform(); 
		
		//Note: This can also be done using
		//a.moveToElement(driver.findElement(By.id("tinymce"))).click().doubleClick().build().perform(); 
		 // where .doubleClick is enough, but also add .click() to ENSURE that test gets highlited.
		
		

	}

}
