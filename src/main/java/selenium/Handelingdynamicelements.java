package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handelingdynamicelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amira\\Downloads\\chromedriver\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://register.rediff.com/register/register.php?FormName=user_details");
		chrome.findElements(By.xpath("//*[@id=\'tblcrtac\']/tbody/tr[3]/td[3]/input"));
		chrome.findElements(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input"));
		
	}
	}


