package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebDriverWait wait = new WebDriverWait (driver, 10);

        WebElement acceptButton = driver.findElement(By.xpath("//*/button[@data-role=\"accept-consent\"]"));
        wait.until(ExpectedConditions.visibilityOf(acceptButton)).click();

        WebElement category = driver.findElement(By.xpath("//*/div[@class=\"mp7g_oh mr3m_1 s4kyg\"]/select/optgroup/option[3]"));
        wait.until(ExpectedConditions.visibilityOf(category)).click();

        WebElement inputField = driver.findElement(By.xpath("//*/input[@role=\"combobox\"]"));
        wait.until(ExpectedConditions.visibilityOf(inputField));
        inputField.sendKeys("Mavic mini");
        inputField.submit();
    }
}