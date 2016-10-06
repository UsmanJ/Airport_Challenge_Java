package Plane;

/**
 * Created by UsmaanJ on 06/10/2016.
 */
public class Plane {
    public boolean isOn;
    public boolean isReady;
    public boolean isFlying;

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
}
