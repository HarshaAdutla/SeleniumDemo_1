/* import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        WebDriver driver = new ChromeDriver();
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
        driver.get("www.projects.awigntest.com");
        driver.manage().window().maximize();
        driver.close();
    }
}
*/
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        ChromeDriverService service = ChromeDriverService.createDefaultService();
        WebDriver driver = new ChromeDriver(service);
        driver.manage().window().maximize();
        driver.get("www.awigntest.com");
                Thread.sleep(2000);
        driver.findElement(By.className("pointer ")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("hr050798@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("050798");
        Thread.sleep(1000);
        driver.findElement(By.className("btn-primary")).click();
        Thread.sleep(4000);
//        String Error_message = driver.findElement(By.className("text-danger")).getText();
//        assert Error_message.contains("Invalid");
//        System.out.println("Entered credentials are wrong, please check and try again");
        System.out.println("Successfully Logged into Projects Platform");
        driver.findElement(By.xpath("//button[@type= 'button']")).click();
        Thread.sleep(6000);
        System.out.println(driver.getTitle());
    }
}