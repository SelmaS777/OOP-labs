package week5.Task1;

public class CivilService implements NationalService {
    private int daysLeft;

    public CivilService() {
        this.daysLeft = 362;
    }

    public int getDaysLeft() {
        return daysLeft;
    }

    public void work() {
        if (daysLeft < 0) {
            daysLeft--;
        }
    }
}
