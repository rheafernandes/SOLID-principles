package LightBulb;

public class LightBulb implements ElectricalAppliance{

    public boolean turnOn(){
        System.out.println("Turning Bulb on");
        return true;
    }

    public boolean turnOff(){
        System.out.println("Turning Bulb off");
        return false;
    }
}
