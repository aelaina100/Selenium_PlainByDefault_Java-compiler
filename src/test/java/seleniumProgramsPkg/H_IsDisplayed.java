package seleniumProgramsPkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class H_IsDisplayed {

	public static void main(String[] args) throws InterruptedException {
		//https://www.makemytrip.com/charter-flights/
		
		// TASK: Ensure that the button of 'Add Another City" ONLY & ONLY appears when ONLY the radio button of "Multicity" is selected
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/flights/");
	
		Thread.sleep(8000L);
	
		//Note: seems these radio buttons cant be selected even though the locators are correct. Utilize Action class or Java script commands
		
		int count =driver.findElements(By.xpath("//ul[@class= 'fswTabs latoBlack greyText']/li")).size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
		{
			String TripType= driver.findElements(By.xpath("//ul[@class= 'fswTabs latoBlack greyText']/li")).get(i).getText();
			System.out.println(TripType);
			driver.findElements(By.xpath("//ul[@class= 'fswTabs latoBlack greyText']/li/span")).get(i).click(); //modified
		}
		/*
		
			for(int i=0; i<count; i++)
			{
			String TripType= driver.findElements(By.xpath("//ul[@class= 'fswTabs latoBlack greyText']/li")).get(i).getText();  //fine
			System.out.println(TripType);  //fine
			
			driver.findElements(By.xpath("//ul[@class= 'fswTabs latoBlack greyText']/li/span")).get(i).click(); //modified  */
			}}
/* if (! TripType.equalsIgnoreCase("Municipality"))
			{
				Boolean x=  driver.findElement(By.xpath("//button[contains(text(),'ADD ANOTHER CITY')]")).isDisplayed();
						
				if (x)
				{
					System.out.println("BUG: The button of 'Add Another City' should NOt be displayed when radio:" +TripType+ " is selected");
				}
				
				else
				{
					System.out.println("PASS: The button of 'Add Another City' Is NOT displayed when radio:" +TripType+ " is selected ");
				}
				
 if  ( TripType.equalsIgnoreCase("Municipality"))
				{
					
					Boolean y=  driver.findElement(By.xpath("//button[contains(text(),'ADD ANOTHER CITY')]")).isDisplayed();
					if (y)
					{
						System.out.println("PASS: The button of 'Add Another City' Is displayed when radio:" +TripType+ " is selected");
					}
					
					else
					{
						System.out.println("FAILED: The button of 'Add Another City' Is NOT displayed when radio:" +TripType+ " is selected ");
					}
					
				} 
			} 
		}

	}

} */
