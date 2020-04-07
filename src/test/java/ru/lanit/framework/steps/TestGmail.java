package ru.lanit.framework.steps;


import org.openqa.selenium.By;
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
        String title = webDriver.getTitle();
        webDriver.findElement(By.xpath("//*[@id='misago-container']/nav//ul/li[3]/a")).click();
        webDriver.findElement(By.xpath("/html/body/div[3]/nav//ul/li[2]/a")).click();
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']//a/i")).click();
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']//ul/li[1]/input")).sendKeys("Svetlana");
        webDriver.findElement(By.xpath("//*[@id='user-menu-mount']//ul/li[3]/a//div[2]/h5")).click();
        Assert.assertEquals(title, "Lanit education", "Тест не пройден");
        System.out.println("Браузер был открыт " + ((ChromeDriver) webDriver).getSessionId());
        webDriver.quit();
    }

}
