package seleniumProgramsPkg;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class E_RadioButton {

	public static void main(String[] args) throws InterruptedException {
		
		// https://echoecho.com/htmlforms10.htm
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://echoecho.com/htmlforms10.htm");
		Thread.sleep(4000L);
		
		// 1- click on, one by one, the radio buttons of water, beer, & wine
		int count= driver.findElements(By.name("group2")).size();
		for (int i=0; i<count; i++)
		{
			driver.findElements(By.name("group2")).get(i).click();
			Thread.sleep(2000L);     //since radio buttons are clicked very fast.
		}
				
		
		// 2- click on, one by one, the radio buttons of Milk, butter, & cheese
		int sec_count = driver.findElements(By.name("group1")).size();
		for (int i=0; i<sec_count; i++)
		{
			driver.findElements(By.name("group1")).get(i).click();
			Thread.sleep(2000L);     //since radio buttons are clicked very fast.
		}
		
		// 3- click on, one by one, All of the 6 radio buttons: Milk, butter, cheese, water, beer, & wine
        Thread.sleep(5000L);
		int third_count= driver.findElements(By.xpath("//a[text()='<< PREVIOUS']//parent::td/parent::tr/parent::tbody/parent::table/parent::td/parent::tr/parent::tbody/parent::table/preceding-sibling::table[1]/tbody/tr/td/table/tbody/tr/td/input")).size();
		for (int i=0; i<third_count; i++)
		{
			driver.findElements(By.xpath("//a[text()='<< PREVIOUS']//parent::td/parent::tr/parent::tbody/parent::table/parent::td/parent::tr/parent::tbody/parent::table/preceding-sibling::table[1]/tbody/tr/td/table/tbody/tr/td/input")).get(i).click();
			Thread.sleep(3000L);
		} 
	}

}
