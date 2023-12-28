package week13.Task5;

import java.util.GregorianCalendar;

public class RedLightState implements TrafficLightState{
    @Override
    public void transitionToRed(TrafficLightContext context){
        System.out.println("Already in Red light state");
    }

    @Override
    public void transitionToGreen(TrafficLightContext context){
        System.out.println("Switching to Green light state");
        context.setState(new GreenLightState());
    }

    @Override
    public void transitionToYellow(TrafficLightContext context){
        System.out.println("Switching to Yellow light state");
        context.setState(new YellowLightState());
    }
}
