package domain;

import java.util.HashSet;
import java.util.Set;

public class Airport {

    private String id;
    private String location;
    private Set <Airport> incomingFlightsLocations = new HashSet<>();
    private Set <Airport> outgoingFlightsLocations = new HashSet<>();

    public Airport(String id, String location){
        this.id = id;
        this.location = location;
    }

    public String getId() {return id;}

    public void setId(String id) { this.id = id;}

    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public Set<Airport> getIncomingFlightsLocations() {return incomingFlightsLocations;}

    public void setIncomingFlightsLocations(Set<Airport> incomingFlightsLocations){
        this.incomingFlightsLocations = incomingFlightsLocations;
    }
    public Set<Airport> getOutgoingFlightsLocations(){ return outgoingFlightsLocations;}

    public void addIncomingFlightLocation(Airport airport){
        incomingFlightsLocations.add(airport);
    }

    public void addOutgoingFlightLocation(Airport airport){
        outgoingFlightsLocations.add(airport);
    }
}



























































+








