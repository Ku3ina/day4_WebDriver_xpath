package ru.lanit.framework.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.lanit.framework.webdriver.WebDriverManager;

public class TestGmail {

    @Test
    public void testGmail() throws InterruptedException {
        WebDriver webDriver = WebDriverManager.getDriver();
//  немного практики из лекции
        webDriver.get("https://yandex.ru/");
        webDriver.findElement(By.id("text")).click();
        webDriver.findElement(By.id("text")).sendKeys("Hello world!");
        webDriver.findElement(By.id("text")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

        webDriver.get("https://dev.n7lanit.ru/");
        webDriver.findElement(By.xpath("//*[@id='page-mount']/div/div[2]/div[1]/div[1]/div/button")).click();
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id='misago-container']/nav/div/ul/li[3]/a")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("/html/body/div[3]/nav/div/ul/li[2]/a")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']/div/div/div/a/i")).click();
        Thread.sleep(500);
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']//div/ul/li[1]/input")).sendKeys("Svetlana");
        Thread.sleep(1000);
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']//ul/li[3]/a/div/div[2]/h5")).click();
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id='page-mount']//div[1]//div[1]/div//h1")).isDisplayed(), "Элемент найден!");
        System.out.println("Браузер был открыт " + ((ChromeDriver) webDriver).getSessionId());
        Thread.sleep(1000);
        webDriver.quit();
        // получилось больше 30 строк, увы

    }
}
