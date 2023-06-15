package resources;

import domain.Airport;
import domain.Flight;

import java.util.HashMap;
import java.util.Map;

public class AirportResource {

    private HashMap<String, Airport> airports = new HashMap<>();

    public AirportResource(){
        Airport gdn = new Airport("GDN", "Gdansk Lech Walesa Airport");
        Airport epsd = new Airport("EPSD", "Szczecin Dabie Airport");
        Airport ieg = new Airport("IEG" , "Zielona Gora Airport");
        Airport waw = new Airport("WAW", "Warsaw Chopin Airport");
        Airport luz = new Airport("LUZ", "Lublin Airport");
        Airport rze = new Airport("RZE", "Rzeszow Jasionka Airport");
        Airport krk = new Airport("KRK", "Karkow Airport");
        Airport ktw = new Airport("KTW", "Katowice Airport");

        airports.put("GDN", gdn);
        airports.put("EPSD", epsd);
        airports.put("IEG", ieg);
        airports.put("WAW", waw);
        airports.put("LUZ", luz);
        airports.put("RZE", rze);
        airports.put("KRK", krk);
        airports.put("KTW", ktw);

        addFlight(new Flight(gdn, waw));
        addFlight(new Flight(gdn, rze));
        addFlight(new Flight(gdn, krk));
        addFlight(new Flight(gdn, ktw));
        addFlight(new Flight(epsd, waw));
        addFlight(new Flight(waw, luz));
        addFlight(new Flight(waw, gdn));
        addFlight(new Flight(waw, rze));
        addFlight(new Flight(waw, epsd));
        addFlight(new Flight(waw, krk));
        addFlight(new Flight(waw, ktw));
        addFlight(new Flight(luz, waw));
        addFlight(new Flight(rze, gdn));
        addFlight(new Flight(rze, waw));
        addFlight(new Flight(krk, gdn));
        addFlight(new Flight(krk, waw));
        addFlight(new Flight(ktw, gdn));
        addFlight(new Flight(ktw, waw));
        }

        public void addFlight(Flight flight){
        Airport from = flight.getFrom();
        Airport to = flight.getTo();

        airports.get(from.getId()).addOutgoingFlightLocation(to);
        airports.get(to.getId()).addIncomingFlightLocation(from);

        }

        public Map<String,Airport> getALL(){return airports;}
}
