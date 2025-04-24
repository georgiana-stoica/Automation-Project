package org.example;

import org.example.AbstractComponents.SearchFlight;
import org.example.PageComponents.MultiTrip;
import org.example.PageComponents.RoundTrip;
import org.example.PageObjects.TravelHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

    By sectionElement = By.id("flightSearchContainer");

    @Test
    public void flightTest() {
        System.setProperty("webdriver.chrome.driver", "libs//windows//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        TravelHomePage travelHomePage = new TravelHomePage(driver);
        travelHomePage.goTo();
        travelHomePage.getFooterNavigation().selectFlight();
        travelHomePage.getNavigationBar().selectFlight();
        travelHomePage.getNavigationBar().navElementCount();

        //travelHomePage.setBookingStrategy(new MultiTrip());
        travelHomePage.setBookingStrategy(new RoundTrip(driver, sectionElement));
        travelHomePage.checkAvailable("CCU", "AIP");
        driver.quit();
    }
}
