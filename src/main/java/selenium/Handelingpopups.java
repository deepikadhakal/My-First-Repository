package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingpopups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amira\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get(" https://echoecho.com/javascript4.htm");
		chrome.findElement(By.name("B2")).click();
		chrome.switchTo().alert().getText();
	}

}
