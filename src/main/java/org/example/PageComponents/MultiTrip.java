package org.example.PageComponents;

import org.example.AbstractComponents.SearchFlight;

public class MultiTrip implements SearchFlight {
    @Override
    public void checkAvailable(String origin, String destination) {
        System.out.println("I am inside MultiTrip");
    }
}
