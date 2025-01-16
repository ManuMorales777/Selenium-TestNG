package examen.selenium.manumorales777;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UseTestNG {
     private static WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().driverVersion("131").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void navigateToHome() {
        driver.get("https://demoqa.com/");
    }

    

    @Test (dependsOnMethods = {"navigateToHome"})
    public void goToElements() {
        try {
            Thread.sleep(2000);
            // Agregamos un pequeño tiempo de espera para asegurar que la página cargue
            WebElement element = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]")); 
            element.click(); 
        } catch (InterruptedException e) {
            System.out.println("Error, no se encontro elemento");
            e.printStackTrace();
        }
    }

    @Test (dependsOnMethods = {"goToElements"})
    public void TestElements() throws IOException {
        try {
            Thread.sleep(2000);
            WebElement TextForm = driver.findElement(By.id("item-0"));
            TextForm.click();
            Thread.sleep(2000);

            WebElement nameText = driver.findElement(By.cssSelector("#userName")); 
            nameText.sendKeys("Manuel Morales"); 
            WebElement emailText = driver.findElement(By.id("userEmail")); 
            emailText.sendKeys("manuelrey51@gmail.com"); 
            WebElement addressText = driver.findElement(By.xpath("//*[@id='currentAddress']")); 
            addressText.sendKeys("Zona 5, "+Keys.chord(Keys.SHIFT, Keys.ENTER)+"Ciudad de Guatemala");
            WebElement permanentaddressText = driver.findElement(By.id("permanentAddress")); 
            permanentaddressText.sendKeys("Zona 5, "+Keys.chord(Keys.SHIFT, Keys.ENTER)+"Ciudad de Guatemala");
            WebElement SubmitForm = driver.findElement(By.xpath("//*[@id='submit']"));
            JavascriptExecutor scrolltoSubmit = (JavascriptExecutor) driver;
            scrolltoSubmit.executeScript("arguments[0].scrollIntoView(true);", SubmitForm);
            SubmitForm.click();
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshot.png"));  
        } catch (InterruptedException e) {
            System.out.println("Error, no se encontro elemento");
            e.printStackTrace();
        }
    }


    @Test (dependsOnMethods = "TestElements")
    public void TestAdvanceForms() throws IOException {
        try{
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); 
        WebElement Form = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='app']/div/div/div/div[1]/div/div/div[2]/span/div")));
        Form.click();
        JavascriptExecutor scrolltoTop = (JavascriptExecutor) driver;
        scrolltoTop.executeScript("window.scrollTo(0, 0);");
        Thread.sleep(2000);
        WebElement PracticeForm = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div/div[1]/div/div/div[2]/div/ul/li")));
        PracticeForm.click();
        
        WebElement maleRadioButton = driver.findElement(By.xpath("//label[@for='gender-radio-1']")); 
        maleRadioButton.click(); 

        WebElement CheckboxSports = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")); 
        JavascriptExecutor scrolltoCheckbox = (JavascriptExecutor) driver;
        scrolltoCheckbox.executeScript("arguments[0].scrollIntoView(true);", CheckboxSports);
        CheckboxSports.click(); 

        WebElement CheckboxMusic = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-3']")); 
        CheckboxMusic.click(); 
        
        WebElement SubmitForm = driver.findElement(By.xpath("//*[@id='submit']"));
        JavascriptExecutor scrolltoSubmit = (JavascriptExecutor) driver;
        scrolltoSubmit.executeScript("arguments[0].scrollIntoView(true);", SubmitForm);
        SubmitForm.click();
        
        scrolltoTop.executeScript("window.scrollTo(0, 0);");

        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("screenshot2.png"));
    }catch(InterruptedException e){
        System.out.println("Error, no se encontro elemento");
        e.printStackTrace();
    }
    }

    @Test (dependsOnMethods = "TestAdvanceForms")
    public void navigateToHomeDropDown() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String url = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
        js.executeScript("window.open('" + url + "');");
        Set<String> handles = driver.getWindowHandles();
        driver.switchTo().window(handles.toArray(new String[handles.size()])[1]);
    }


    @Test (dependsOnMethods = "navigateToHomeDropDown")
    public void dropdownTest() throws IOException{
        try{
            Thread.sleep(2000);
            
            WebElement dropdown = driver.findElement(By.tagName("select"));
            Select select = new Select(dropdown);
            select.selectByVisibleText("Guatemala");

            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File("screenshot3.png"));
        
        }
            catch(InterruptedException e){
            System.out.println("Error, no se encontro elemento");
             e.printStackTrace();
            }
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
