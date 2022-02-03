package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amira\\Downloads\\chromedriver\\chromedriver.exe");
ChromeDriver chrome=new ChromeDriver();
chrome.get(" https://https://www.facebook.com/");
chrome.findElement(By.name("sex")).click();
	}

}
