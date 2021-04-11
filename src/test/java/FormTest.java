import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest extends TestBase {

    @BeforeMethod
    public void init() {
        wd.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[2]/div/div[2]")).click();
        wd.findElement(By.xpath("//span[.='Practice Form']")).click();
    }

    @Test
    public void formTest() {


    }

}



