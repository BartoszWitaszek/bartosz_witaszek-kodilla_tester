package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KodillaStorePomTestSuite {

    KodillaStorePom kodillaStorePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
        driver.navigate().to("https://kodilla.com/pl/test/store");
        kodillaStorePom = new KodillaStorePom(driver);
    }

    @Test
    public void testSearchWith2Results() {
        Assertions.assertEquals(2, kodillaStorePom.search("NoteBook").size());
    }

    @Test
    public void testSearchWith2Results_CaseSensitive() {
        Assertions.assertEquals(2, kodillaStorePom.search("notebook").size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"School", "Brand", "Gaming"})
    public void testSearchWith1Result(String searchValue) {
        Assertions.assertEquals(1, kodillaStorePom.search(searchValue).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"school", "brand", "gaming"})
    public void testSearchWith1Result_CaseSensitive(String searchValue) {
        Assertions.assertEquals(1, kodillaStorePom.search(searchValue).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"Business", "Powerful"})
    public void testSearchWith0Results(String searchValue) {
        Assertions.assertEquals(0, kodillaStorePom.search(searchValue).size());
    }

    @ParameterizedTest
    @ValueSource(strings = {"business", "powerful"})
    public void testSearchWith0Results_CaseSensitive(String searchValue) {
        Assertions.assertEquals(0, kodillaStorePom.search(searchValue).size());
    }

    @AfterEach
    public void testDown() {
        kodillaStorePom.close();
    }
}