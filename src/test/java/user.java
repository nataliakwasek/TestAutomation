import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.chrome.ChromeDriver;

public class user {
    String projectLocation = System.getProperty("user.dir");
@Test
    public void testOne() {
        System.out.println(projectLocation);
        System.setProperty("webdriver.chrome.driver", projectLocation+"/Resource/chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.get("https://ultimateqa.com/simple-html-elements-for-automation/");

    WebElement buttonUsingId = driver.findElement(By.id("idExample"));
    buttonUsingId.click();
    }


}
