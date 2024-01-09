package seleniumProgramsPkg;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// https://www.aircanada.com/ca/en/aco/home.html#/home:flight
   //1- In the 'Passenger' dropdown, ensure that choosing the maximum number of 'Adults' is '9' 

                                       


public class A1_creative_Drop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Third_Party_Browsers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	driver.get("https://www.aircanada.com/ca/en/aco/home.html#/home:flight");
		
	driver.findElement(By.id("bkmgFlights_selectTravelersMainContainer")).click(); // Identified & clicks on the 'passenger(s)' dropdown.
		
int numberOfClicks=0;

Actions a= new Actions(driver);
WebElement Passenger_adult_PlusSign=  driver.findElement(By.xpath("//button[@id= 'bkmgFlights_selectTravelers_addTraveler_ADT']"));

while(driver.findElement(By.id("bkmgFlights_selectTravelers_addTraveler_ADT")).getAttribute("aria-disabled").contains("false"))
{
	a.moveToElement(Passenger_adult_PlusSign).click().build().perform(); // Not using Actions class, deems locator unstable for identfification.
	numberOfClicks= numberOfClicks+1;
}
System.out.println("Number of actual max clicks performed on webpage as of now is: " +numberOfClicks);   
if(numberOfClicks==8)
{
int Max_number_adults= numberOfClicks + 1;
System.out.println("PASSED: Number of maximum clicks is: " + numberOfClicks + " (Meaning: Maximum number of adults is: "+ Max_number_adults +")");
}	
else
{
int Max_number_adults= numberOfClicks+1;
System.out.println("FAILED: Number of Maximum clicks is: " + numberOfClicks + " (Meaning: Maximum number of adults is: "+ Max_number_adults +")");
}
		
		
		
		
		
		
		
		//1- earlier code/ first attempt:
		
	  /* int counter= 0;
	   WebElement Adult_positive_sign= driver.findElement(By.id("bkmgFlights_selectTravelers_addTraveler_ADT"));
	   while(Adult_positive_sign.getAttribute("aria-disabled").contains("false"))
	   {
		   driver.findElement(By.id("bkmgFlights_selectTravelers_addTraveler_ADT")).click();
		   counter= counter +1;
		   System.out.println(counter);   
	   }
	 //.getText();// Will NOT work. It will Throw an error as number isn't available anywhere in HTML.
	   int max_number_adults_displayed= counter +1;
	   if(counter==8) // why '8' ? this depends on studying the behaviour of UI for this specific testcase.
	   {
		   System.out.println("PASSED: " +max_number_adults_displayed+ " is the maximum number of 'Adults' that can be selected"); 
		   //Crucial:   counter+1   inside line will add up. Instead, '1' will be attached to 'counter'
	   }
	   else
	   {
		   System.out.println("FAILED: " + max_number_adults_displayed+1 + " is the maximum number of 'Adults' shown as opposed to 9" );
	   }
//.getText();// Will NOT work. It will Throw an error as number isn't available anywhere in HTML.
	  
	    */
		
//Thread.sleep(7000L);
//driver.quit();
	}

}
