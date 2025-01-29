package org.webtablepratice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		String end = "Zimbabwe";
		
	    WebElement table = driver.findElement(By.xpath("//table[@id='countries']"));
		
		List<WebElement> trdatas = driver.findElements(By.tagName("tr"));
		
		List<WebElement> checkbox = driver.findElements(By.xpath("//input[@class='hasVisited' or @type='checkbox']"));

		for(int i=0;i<checkbox.size();i++ ) {
		
			checkbox.get(i).click();		
			
		}
		
		
		for(int j=0;j<trdatas.size();j++) {
			
		System.out.println(trdatas.get(j).getText());
	
		
		}
		
		
	
	}

}
