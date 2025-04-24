package org.example.PageComponents;

import org.example.AbstractComponents.AbstractComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FooterNavigation extends AbstractComponent {

    WebDriver driver;
    By links = By.cssSelector("a");

    public FooterNavigation(WebDriver driver, By sectionElement) {
        super(driver, sectionElement); //when inherit parent class you have to invoke parent class constructor in the child constructor
    }

    public int getLinkCount()
    {
        return findElements(links).size();
    }


}
