package Swag_labs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Add_MoreThanOne {
	WebDriver driver;


	@BeforeMethod  
    public void oPenUrl() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\visha\\eclipse-workspace\\e_commerce\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();  
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
	 @Test
	    public void TC_signIn() throws InterruptedException {
	        driver.findElement(By.id("user-name")).sendKeys("standard_user"); 
	        driver.findElement(By.id("password")).sendKeys("secret_sauce");
	        driver.findElement(By.id("login-button")).click();
	        Thread.sleep(6000);
	        
	        //add items to cart
	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
	        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
	        
	        
	      //check the cart
	       driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	        
	        //continue shopping
	        
	        driver.findElement(By.id("continue-shopping")).click();
	        
	        //again add a item
	        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	        
	        //check the cart
	        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

	       
	     
	        //checkout
	        
		    driver.findElement(By.id("checkout")).click();
		       
		    //add details
		       
		    driver.findElement(By.id("first-name")).sendKeys("vishaka");
		    driver.findElement(By.id("last-name")).sendKeys("Lakmali");
		    driver.findElement(By.id("postal-code")).sendKeys("222000");
		       
		    driver.findElement(By.xpath("//input[@name='continue'] ")).click();
		       
		       
		    //complete the order
		    driver.findElement(By.id("finish")).click();
		    
		    //back to home
		  driver.findElement(By.id("back-to-products")).click();
		    
		    
		     
		        
		    

	       
	 
	 }
}