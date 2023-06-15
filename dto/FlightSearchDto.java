package dto;

import domain.Flight;

import java.util.List;

public class FlightSearchDto {

    private Flight directFlight;
    private List<Flight> jointFlights;

    public FlightSearchDto(final Flight directFlight, final List<Flight> jointFlights){
        this.directFlight = directFlight;
        this.jointFlights = jointFlights;
    }

    public Flight getDirectFlight(){return directFlight;}

    public List<Flight> getJointFlights(){return jointFlights;}
}
