package Airport;

/**
 * Created by UsmaanJ on 06/10/2016.
 */
public class Airport {
    public String airportCode;
    public int capacity;
    public int spaces;
    public boolean isOpen;
    public boolean isBadWeather;

    public Airport (String airportCode, int capacity) {
        this.airportCode = airportCode;
        this.capacity = capacity;
    }

    public void openAirport() {
        if (!isOpen) {
            isOpen = true;
        }
    }

    public void closeAirport() {
        if (isOpen) {
            isOpen = false;
        }
    }

    public void airportStatus() {
        System.out.println("Airport Code: " + airportCode);
        System.out.println("Capacity: " + capacity);
        System.out.println("Spaces: " + spaces);
        System.out.println("isOpen: " + isOpen);
        System.out.println("isBadWeather: " + isBadWeather);
    }

}
