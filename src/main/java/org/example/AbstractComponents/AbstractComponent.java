package org.example.AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class AbstractComponent {

    WebDriver driver;
    WebElement sectionElement;
    By flights = By.cssSelector("[title='Flights']");

    public AbstractComponent(WebDriver driver, By sectionElement) {
        this.driver = driver;
        this.sectionElement = driver.findElement(sectionElement);
    }

    public WebElement findElement(By findElementBy) {
        return sectionElement.findElement(findElementBy);
    }

    public List<WebElement> findElements(By findElementBy) {
        return sectionElement.findElements(findElementBy);
    }

    public void selectFlight() {
        System.out.println(findElement(flights).getAttribute("class"));
        //driver.findElement(flights).click();
    }

}
