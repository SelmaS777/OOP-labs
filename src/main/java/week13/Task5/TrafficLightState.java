package week13.Task5;

public interface TrafficLightState {
    void transitionToRed(TrafficLightContext context);
    void transitionToGreen(TrafficLightContext context);
    void transitionToYellow(TrafficLightContext context);
}
