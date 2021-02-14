package shwapno.shwapno;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class shwapno {
	

	
	
	
	@Test
	public static  void testshwapno() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.shwapno.com");
		
		//dropdown 1
		Select mydrpdwn1 = new Select(driver.findElement(By.xpath("//select[@id='state']")));
		mydrpdwn1.selectByVisibleText("Dhaka");
		 driver.manage().window().maximize();
		 //dropdown2
		 Select mydrpdwn2 = new Select(driver.findElement(By.xpath("//select[@id='city']")));
			mydrpdwn2.selectByVisibleText("Badda");
			
			//submit bitton
			
			driver.findElement(By.id("btnFindStore")).click();
			Thread.sleep(1000);
			
	
	/*
			//Registation
	        @BeforeSuite
			public static void registrationform() throws InterruptedException{
		    driver.findElement(By.xpath("//a[@class='loginlnk  header-register-link RegistrationPopUpLink']")).click();
			
			
			
			Thread.sleep(2000);
			 WebElement username = driver.findElement(By.xpath("//input[@id='txtFirstName']"));
			 username.sendKeys("abdul_hannan");
			
			 WebElement email = driver.findElement(By.xpath("//input[@class='maintxt InputUserName']"));
			 email.sendKeys("abdhannanm@gmail.com");
			 
			 WebElement phone = driver.findElement(By.xpath("//input[contains(@jval_v2,\"{valid:function (val) {return Phonevalidation(val);},iframe:'true'}\")]"));
			 phone.sendKeys("01771918711");
			 
			 WebElement pass = driver.findElement(By.xpath("//input[@name='txtPassword']"));
			 pass.sendKeys("shwapno84");
			 
			 WebElement cpass = driver.findElement(By.xpath("//input[@name='txtConfirmPassword']"));
			 cpass.sendKeys("shwapno84");
			 
	          //sunmit button click
			 driver.findElement(By.xpath("//input[@id='btnSubmit']")).click();
			
		    Thread.sleep(4000);
			}
		*/
		    
	
	
			//for login
	
		driver.findElement(By.xpath("//a[@class='loginlnk  header-login-link LoginPopUpLink']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_UserName']")).sendKeys("abdhannanm@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_Password']")).sendKeys("shwapno84");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_ctl00_ctl01_Login1_LoginImageButton']")).click();
		Thread.sleep(1000);

	
	
	          //product select
				driver.findElement(By.xpath("//span[normalize-space()='Our Own Products']")).click();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath("//img[contains(@src,'//storage.sg.content-cdn.io/cdn-cgi/image/width=400,height=400,quality=75,format=auto,fit=cover,g=top/in-resources/8845e144-8902-4204-b80f-9dc7dc2f4bcb/Images/ProductImages/Source/2400875.jpg')]")).click();
				
				Thread.sleep(1000);
			
				//add cart
				
				driver.findElement(By.xpath("//input[@class='snackbar-msg mj_btnbg BuyNow']")).click();
				Thread.sleep(1000);
				
				//view cart
				
				driver.findElement(By.xpath("//a[contains(normalize-space(),'View Cart')]")).click();
				Thread.sleep(1000);
				
			
			
			
		 
		
		
		
		
		
		
	}
}


