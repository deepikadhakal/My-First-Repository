package selenium;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\amira\\Downloads\\chromedriver\\chromedriver.exl");
ChromeDriver chrome=new ChromeDriver();
chrome.get("https://www.amazon.com/");
chrome.close();
chrome.get("https://www.facebook.com/");
chrome.close();


	}

}
