package resources;

import domain.Airport;

import java.util.HashMap;

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
    }
}
