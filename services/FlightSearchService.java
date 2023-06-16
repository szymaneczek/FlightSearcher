package services;

import domain.Airport;
import domain.Flight;
import dto.FlightSearchDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FlightSearchService {

    private AirportService airportService;
    private Map<String, Airport> airports;

    public FlightSearchService(AirportService airportService){
        this.airportService = airportService;
        airports = airportService.getAllAirports();
    }

    public FlightSearchDto findFlights(String from, String to){
        Airport airportFrom = airports.get(from.toUpperCase());
        Airport airportTo = airports.get(to.toUpperCase());

        Flight directFlight = null;
        List<Flight> jointFlights = new ArrayList<>();

        if (airportFrom.getOutgoingFlightsLocations().contains(airportTo)){
            directFlight = new Flight(airportFrom, airportTo);
        }

        airportFrom.getOutgoingFlightsLocations().stream()
                .filter(airport -> airport.getOutgoingFlightsLocations().contains(airportTo))
                .forEach(airport -> {
                    jointFlights.add(new Flight(airportFrom, airport));
                    jointFlights.add(new Flight(airport, airportTo));
                });

        return new FlightSearchDto(directFlight, jointFlights);
    }

}
