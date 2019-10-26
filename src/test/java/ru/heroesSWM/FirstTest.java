package ru.heroesSWM;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/tatanafedorova/IdeaProjects/GVDRulet/src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.heroeswm.ru/");
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Testerovchik");
        driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Cxld3yoev7");
        driver.findElement(By.xpath("//input[@title='Войти в игру!']")).click();
    }
}
