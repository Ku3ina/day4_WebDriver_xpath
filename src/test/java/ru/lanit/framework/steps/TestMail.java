package ru.lanit.framework.steps;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import ru.lanit.framework.webdriver.WebDriverManager;

public class TestMail {

    @Test
    public void testMail() throws InterruptedException {
        WebDriver webDriver = WebDriverManager.getDriver();
        webDriver.get("https://mail.ru/");
        webDriver.findElement(By.xpath("//*[@id='mailbox:login-input']")).click();
        webDriver.findElement(By.xpath("//*[@id='mailbox:login-input']")).sendKeys("terst2020");
        webDriver.findElement(By.xpath("//*[@id='mailbox:submit-button']/input")).click();
        webDriver.findElement(By.xpath("//*[@id='mailbox:password-input']")).sendKeys("12qw12qw12q");
        webDriver.findElement(By.xpath("//*[@id='mailbox:submit-button']/input")).click();
        Assert.assertTrue(webDriver.findElement(By.xpath("//*[@id='PH_user-email']")).isEnabled(), "Элемент найден!");
        System.out.println("Браузер был открыт " + ((ChromeDriver) webDriver).getSessionId());
        webDriver.quit();
    }

}
