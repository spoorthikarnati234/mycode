package testngfirstproj;
import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Snippet {

    public static void main(String args[]) {

       String Actual = "ctua";
       String Expected = "Expected";

       // Assertion Passing
       Assert.assertTrue(Actual.matches("[a-z]"));

       System.out.println("Passing 1");

       // Assertion failing
      // Assert.fail("Failing 2");

       System.out.println("Failing 2");

       // Check Assert Equals
      // assertEquals(Actual, Expected);
   }
}