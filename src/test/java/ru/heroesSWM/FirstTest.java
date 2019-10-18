package ru.heroesSWM;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/tatanafedorova/IdeaProjects/GVDRulet/src/test/resources/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.heroeswm.ru/");

    }
}
