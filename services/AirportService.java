package services;

import domain.Airport;
import resources.AirportResource;

import java.util.Map;

public class AirportService {

    private AirportResource airportResource;

    public AirportService(AirportResource airportResource){this.airportResource = airportResource;}

    public Map<String, Airport> getAllAirports(){
        return airportResource.getALL();
    }
}
