import dto.FlightSearchDto;
import resources.AirportResource;
import services.AirportService;
import services.FlightSearchService;

public class Main {
    public static void main(String[] args) {

        AirportService airportService = new AirportService(new AirportResource());
        FlightSearchService flightSearchService = new FlightSearchService(airportService);

        System.out.println("Looking for flight from Lublin to Gdansk: ");
        FlightSearchDto findFirstFlight = flightSearchService.findFlights("LUZ","GDN");
        System.out.println("Found direct flight: " + findFirstFlight.getDirectFlight());
        System.out.println("Found joint flights: " + findFirstFlight.getJointFlights());

        System.out.println("Looking for flight from Warsaw to Krakow");
        FlightSearchDto findSecondFlight = flightSearchService.findFlights("waw","krk");
        System.out.println("Found direct flight: " + findSecondFlight.getDirectFlight());
        System.out.println("Found joint flight: " + findSecondFlight.getJointFlights());

        System.out.println("Looking for flight from Rzeszow to Lublin");
        FlightSearchDto findThirdFlight = flightSearchService.findFlights("rze", "luz");
        System.out.println("Found direct flight: " + findThirdFlight.getDirectFlight());
        System.out.println("Found joint flight: " + findThirdFlight.getJointFlights());
    }
}

