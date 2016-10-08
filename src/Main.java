import Plane.Plane;
import Airport.Airport;
/**
 * Created by UsmaanJ on 06/10/2016.
 */
public class Main {
    public static void main (String[] args) {
        Plane PK786 = new Plane("PK786", "A350");
        Airport LHR = new Airport("LHR", 100);
        Airport LHE = new Airport("LHE", 20);

        LHR.openAirport();
        LHR.airportStatus();
        PK786.power();
    }

}
