package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCSS {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium-drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement acceptButton = driver.findElement(By.cssSelector("button[data-role*=accept-consent]"));
        wait.until(ExpectedConditions.visibilityOf(acceptButton)).click();

        WebElement category = driver.findElement(By.cssSelector("option[value='/kategoria/elektronika']"));
        wait.until(ExpectedConditions.visibilityOf(category)).click();

        WebElement inputField = driver.findElement(By.cssSelector("input[role='combobox']"));
        wait.until(ExpectedConditions.visibilityOf(inputField));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        List<WebElement> articles = driver.findElements(By.cssSelector("section > article"));
        for (WebElement article : articles) {
            System.out.println(article.getText());
            System.out.println("-------------------");
        }
    }
}