package seleniumProgramsPkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


// I believe code is correct. However; not working 
public class F_RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		//http://practice.cybertekschool.com/radio_buttons
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://practice.cybertekschool.com/radio_buttons");
		Thread.sleep(4000L);
		// From the list of radio buttons, select 'Yellow'
		int count= driver.findElements(By.name("sport")).size();
		
		for(int i=0; i<count; i++)
		{
			String color= driver.findElements(By.name("color")).get(i).getText();
			if (color.equalsIgnoreCase("Yellow"))
			{
				driver.findElements(By.name("color")).get(i).click();
				break;
				
			}
			else
			{
				continue; 
			}
		} 
		
		// From the list of sports, select 'Hockey'
		int sportCount= driver.findElements(By.name("sport")).size();
		for (int i=0; i<sportCount; i++)
		{
			String sport = driver.findElements(By.name("sport")).get(i).getText();
			if(sport.equalsIgnoreCase("Hockey"))
			{
				driver.findElements(By.name("sport")).get(i).click();
			}
			
			else
			{
				continue;
			} 
			}
		}
	}


