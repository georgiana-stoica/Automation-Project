package org.example.PageComponents;

import org.example.AbstractComponents.AbstractComponent;
import org.example.AbstractComponents.SearchFlight;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RoundTrip extends AbstractComponent implements SearchFlight {

    private By radioButton = By.id("ctl00_mainContent_rbtnl_Trip_1");
    private By from = By.id("ctl00_mainContent_ddl_originStation1_CTXT");
    private By to = By.id("ctl00_mainContent_ddl_destinationStation1_CTXT");
    private By cityBreak = By.id("ctl00_mainContent_chk_IndArm");
    private By search = By.id("ctl00_mainContent_btn_FindFlights");

    public RoundTrip(WebDriver driver, By sectionElement) {
        super(driver, sectionElement);
    }

    @Override
    public void checkAvailable(String origin, String destination) {
        System.out.println("I am inside RoundTrip");
        findElement(radioButton).click();
        findElement(from).click();
        selectOriginCity(origin);
        findElement(to).click();
        selectDestinationCity(destination);
        findElement(cityBreak).click();
        findElement(search).click();
    }

    public void selectOriginCity(String origin) {
        findElement(By.xpath("//a[@value='"+origin+"']")).click();
    }

    public void selectDestinationCity(String destination) {
        findElement(By.xpath("(//a[@value='"+destination+"'])[2]")).click();
    }
}
