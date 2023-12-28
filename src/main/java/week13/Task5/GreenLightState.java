package week13.Task5;

public class GreenLightState implements TrafficLightState{
    @Override
    public void transitionToRed(TrafficLightContext context){
        System.out.println("Switching to Red light state");
        context.setState(new RedLightState());
    }

    @Override
    public void transitionToGreen(TrafficLightContext context){
        System.out.println("Already in Green light state");
    }

    @Override
    public void transitionToYellow(TrafficLightContext context){
        System.out.println("Switching to Yellow light state");
        context.setState(new YellowLightState());
    }
}
