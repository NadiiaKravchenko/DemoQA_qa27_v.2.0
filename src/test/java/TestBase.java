import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;

    @BeforeSuite
    public void preconditions(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        wd.navigate().to("https://demoqa.com/");

    }

    @AfterSuite
    public void tearDown(){
     //   wd.quit();
    }
}


