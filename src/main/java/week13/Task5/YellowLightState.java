package week13.Task5;

public class YellowLightState implements TrafficLightState{
    @Override
    public void transitionToRed(TrafficLightContext context){
        System.out.println("Switching to Red light state");
        context.setState(new RedLightState());
    }

    @Override
    public void transitionToGreen(TrafficLightContext context){
        System.out.println("Switching to Green light state");
        context.setState(new GreenLightState());
    }

    @Override
    public void transitionToYellow(TrafficLightContext context){
        System.out.println("Already in Yellow light state");
    }
}
