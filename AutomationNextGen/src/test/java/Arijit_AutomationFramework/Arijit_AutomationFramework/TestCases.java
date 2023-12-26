/*
 * package Arijit_AutomationFramework.Arijit_AutomationFramework;
 * 
 * import java.awt.AWTException; import java.awt.Robot; import
 * java.awt.event.KeyEvent; import java.net.MalformedURLException; import
 * java.net.URL; import java.util.List; import java.util.concurrent.TimeUnit;
 * 
 * import org.openqa.selenium.By; import org.openqa.selenium.Keys; import
 * org.openqa.selenium.WebDriver; import org.openqa.selenium.WebElement; import
 * org.openqa.selenium.interactions.Action; import
 * org.openqa.selenium.interactions.Actions; import
 * org.openqa.selenium.remote.CapabilityType; import
 * org.openqa.selenium.remote.DesiredCapabilities; import
 * org.openqa.selenium.support.ui.WebDriverWait; import
 * org.testng.annotations.Test;
 * 
 * import io.appium.java_client.AppiumDriver; import
 * io.appium.java_client.remote.MobileCapabilityType;
 * 
 * public class TestCases extends PracticeMainClass {
 * 
 * 
 * 
 * @Test public void test() throws AWTException { try {
 * 
 * DesiredCapabilities caps=new DesiredCapabilities();
 * 
 * Actions a =new Actions(driver); Robot r=new Robot();
 * 
 * 
 * 
 * WebElement
 * elem=driver.findElement(By.xpath("(//input[@class='RNmpXc'])[2]"));
 * 
 * //System.out.println("Checking Thread..."+Thread.currentThread().getId());
 * //a.moveToElement(elem).click().perform();
 * //a.moveToElement(elem).contextClick().perform();
 * //r.keyPress(KeyEvent.VK_ENTER);
 * 
 * //elem.sendKeys(Keys.ENTER);
 * 
 * caps.setCapability(CapabilityType.PLATFORM_NAME, "abc");
 * caps.setCapability(CapabilityType.VERSION,"abc");
 * 
 * caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"abc");
 * caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "abc");
 * caps.setCapability(MobileCapabilityType.UDID, "123");
 * caps.setCapability(MobileCapabilityType.APP,"abcd.com");
 * caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
 * 
 * URL url=new URL("https://safasf");
 * 
 * 
 * AppiumDriver driver;
 * 
 * driver=new AppiumDriver(url,caps);
 * 
 * 
 * } catch (MalformedURLException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * 
 * }
 * 
 * 
 * // try { // // Actions a=new Actions(driver); // WebElement
 * elem=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")); //
 * elem.sendKeys("dropdown demo site"); //
 * driver.findElement(By.xpath("//div[@jsmodel=' vWNDde ']")).click(); //
 * System.out.println("Step 2 Passed"); //
 * driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click(); //
 * driver.findElement(By.xpath("//h3[text()='Dropdown Demo - Formstone']")).
 * click(); //
 * driver.findElement(By.xpath("//button[@id='demo_basic-dropdown-selected']")).
 * click(); // // List<WebElement> element=driver.findElements(By.xpath(
 * "(//div[@class='fs-scrollbar-content'])[1]//button")); // int
 * l=element.size(); // System.out.println(l); // for(int i=1;i<=l;i++) // { //
 * String Xpath="(//div[@class='fs-scrollbar-content'])[1]//button"+"["+i+"]";
 * // System.out.println(Xpath); // String s=
 * driver.findElement(By.xpath(Xpath)).getText(); // System.out.println(s); // }
 * // // } // catch(Exception e) // { // System.out.println(e); // } // }
 * 
 * 
 * 
 * }
 */