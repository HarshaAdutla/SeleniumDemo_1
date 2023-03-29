
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
        driver.get("www.projects.awigntest.com");
        Thread.sleep(2000);
        driver.findElement(By.className("pointer ")).click(); // Here we are clicking on Sign in CTA
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@placeholder = 'Email']")).sendKeys("hr050798@gmail.com"); // Passing the email
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder = 'Password']")).sendKeys("050798"); // Passing the Password
        Thread.sleep(1000);
        driver.findElement(By.className("btn-primary")).click(); // Clicking on Sign in CTA after entering the email and password
        Thread.sleep(4000);
        System.out.println("Successfully Logged into Projects Platform");
        driver.findElement(By.xpath("//button[@type= 'button']")).click(); // Here we are clicking on All Projects option
        Thread.sleep(6000);
        System.out.println(driver.getTitle()); // It will fetch the wesite titile
        driver.close();
    }
}
