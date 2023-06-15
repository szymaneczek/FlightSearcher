package domain;

import java.util.HashSet;
import java.util.Set;

public class Airport {

    private String id;
    private String location;
    private Set <Airport> incomingFlightsLocations = new HashSet<>();
    private Set <Airport> outgoingFlightsLocations = new HashSet<>();
}
