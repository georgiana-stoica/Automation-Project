package org.example.PageObjects;

import org.example.AbstractComponents.SearchFlight;
import org.example.PageComponents.FooterNavigation;
import org.example.PageComponents.NavigationBar;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TravelHomePage {

    WebDriver driver;
    By sectionElement = By.id("traveller-home");
    By footerNavSectionElement = By.id("buttons");
    SearchFlight searchFlight;

    public TravelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo() {
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
    }


    public NavigationBar getNavigationBar() {
        return new NavigationBar(driver, footerNavSectionElement);
    }

    public FooterNavigation getFooterNavigation() {
        return new FooterNavigation(driver, sectionElement);
    }

    public void setBookingStrategy(SearchFlight searchFlight) {
        this.searchFlight = searchFlight;
    }

    public void checkAvailable(String origin, String destination) {
        searchFlight.checkAvailable(origin, destination);
    }

}
