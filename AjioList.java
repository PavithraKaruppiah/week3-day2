package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	Launch the URL https://www.ajio.com/
		WebDriverManager.chromedriver().setup();
		ChromeDriver ajio =new ChromeDriver();
		ajio.manage().window().maximize();
		Thread.sleep(3000);
		ajio.get("https://www.ajio.com/");
		
		//In the search box, type as "bags" and press enter
		ajio.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		//To the left  of the screen under " Gender" click the "Men"
		ajio.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		//Under "Category" click "Fashion Bags"
		ajio.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		//Print the count of the items Found. 
		String text = ajio.findElement(By.xpath("//div[@class='length']")).getText();
		System.out.println("Item found   "+ text );
		
		  //Get the list of brand of the products displayed in the page and print the list.
		System.out.println("List of Brands");
		List<WebElement> brand = ajio.findElements(By.className("brand"));
		System.out.println(brand.size());
		
		for (WebElement webElement : brand) {
			String text2 = webElement.getText();
			System.out.println(text2);
		}
//Get the list of names of the bags and print it
		
		List<WebElement> name = ajio.findElements(By.className("nameCls"));
		System.out.println(name.size());
		for (WebElement webElement1 : name) {
			String text3 = webElement1.getText();
			System.out.println(text3);
			
		}
	}

	
	}


