package week6.HashMaps.Task2;

import java.util.HashMap;

public class PromissoryNote {
    private HashMap<String, Double> loans;
    public PromissoryNote(){
        this.loans = new HashMap<>();
    }

    public void setLoan(String name, double value){
        loans.put(name, value);
    }

    public double Debt(String name){
        return loans.getOrDefault(name, 0.0);
    }
}
