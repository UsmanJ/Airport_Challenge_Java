package Plane;

/**
 * Created by UsmaanJ on 06/10/2016.
 */
public class Plane {
    public String flightNumber;
    public String planeModel;
    public boolean isOn;
    public boolean isReady;
    public boolean isFlying;

    public Plane (String flightNumber, String planeModel) {
        this.flightNumber = flightNumber;
        this.planeModel = planeModel;
    }

    public boolean power() {
        if(isOn) {
            isOn = false;
        } else {
            isOn = true;
        }

        System.out.println("Plane isOn equals " + isOn);

        return isOn;
    }

    public boolean takeOff() {
        if(isFlying) {
            System.out.println("The plane is already flying");
        } else {
            isFlying = true;
            System.out.println("The plane has taken off");
        }
        return isFlying;
    }

    public String getFlightNumber() {
        System.out.println(flightNumber);
        return flightNumber;
    }

    public String getPlaneModel() {
        System.out.println(planeModel);
        return planeModel;
    }
}
