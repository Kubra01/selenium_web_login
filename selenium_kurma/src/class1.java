import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class1 {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        
        driver.get("http://www.google.com/");

        driver.manage().window().maximize();
    }
}
