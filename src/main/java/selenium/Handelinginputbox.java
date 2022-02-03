package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelinginputbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amira\\Downloads\\chromedriver\\chromedriver.exe");
ChromeDriver chrome=new ChromeDriver();
chrome.get("https://www.facebook.com");
chrome.findElement(By.name("email")).sendKeys("deepika.aahana@gmail.com");
chrome.findElement(By.id("pass")).sendKeys("aahana14");
chrome.findElement(By.name("login")).click();

	}

}
