import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver/chromedriver.exe");

            WebDriver driver = new ChromeDriver();

            driver.get("http://www.google.com/");

            driver.manage().window().maximize();


            driver.findElement(By.name("q")).sendKeys("Java");

            Thread.sleep(2500);

            driver.findElement(By.className("gN089b")).click();
    }
}
