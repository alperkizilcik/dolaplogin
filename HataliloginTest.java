// Generated by Selenium IDE
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class HataliloginTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void hatalilogin() {
    driver.get("https://dolap.com/");
    driver.findElement(By.linkText("GİRİŞ | ÜYE OL")).click();
    js.executeScript("window.scrollTo(0,200)");
    driver.findElement(By.linkText("Giriş yap")).click();
    driver.findElement(By.name("username")).click();
    driver.findElement(By.name("username")).sendKeys("alper_kizilcik@hotmail.c");
    driver.findElement(By.name("password")).sendKeys("123123");
    driver.findElement(By.id("login-button")).click();
    driver.findElement(By.cssSelector("#login-form > .alert")).click();
    driver.findElement(By.cssSelector("#login-form > .alert")).click();
    Assert.assertEquals(driver.findElement(By.cssSelector("#login-form > .alert")).getText(), true, is("Kullanıcı adı veya şifre hatalı. Giriş yapılamıyor."));
    driver.close();
  }
}
