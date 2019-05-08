import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;



public class WebDriverTest {
    @Rule
    public WebDriverRule driverRule = new WebDriverRule ();

    @Test
    public void test() {
        driverRule.driver().get("https://auto.ru/");
        driverRule.driver().findElement(By.xpath("//div[contains(@class, 'ServiceNavigation')]//a[contains(., 'Объявления')]")).click();
assertThat("Перешли на новую страницу",
        driverRule.driver().getCurrentUrl(), containsString("cars/all"));
    }
}
