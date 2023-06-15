package services;

import domain.Airport;

import java.util.Map;

public class FlightSearchService {

    private AirportService airportService;
    private Map<String, Airport> airports;

    public FlightSearchService(AirportService airportService){
        this.airportService = airportService;
        airports = airportService.getAllAirports();
    }


}
