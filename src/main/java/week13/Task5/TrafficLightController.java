package week13.Task5;

public class TrafficLightController {
    public static void main(String[] args) {
        TrafficLightContext context = new TrafficLightContext();

        context.transitionToGreen();
        context.transitionToYellow();
        context.transitionToRed();
        context.transitionToYellow();
        context.transitionToGreen();
    }
}
