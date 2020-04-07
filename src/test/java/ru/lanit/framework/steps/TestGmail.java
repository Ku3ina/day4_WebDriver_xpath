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
        webDriver.get("https://dev.n7lanit.ru/");
   //   webDriver.findElement(By.xpath("//*[@id='page-mount']/div/div[2]/div[1]/div[1]/div/button")).click();
        webDriver.findElement(By.xpath("//*[@id='misago-container']/nav/div/ul/li[3]/a")).click();
        webDriver.findElement(By.xpath("/html/body/div[3]/nav/div/ul/li[2]/a")).click();
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']/div/div/div/a/i")).click();
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']//div/ul/li[1]/input")).sendKeys("Svetlana");
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']//ul/li[3]/a/div/div[2]/h5")).click();
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id='page-mount']//div[1]//div[1]/div//h1")).isDisplayed(), "Элемент найден!");
        System.out.println("Браузер был открыт " + ((ChromeDriver) webDriver).getSessionId());
    //  Thread.sleep(1000);
        webDriver.quit();
    }
}
