package week6.HashMaps.Task1;

import java.util.HashMap;

public class PeopleNamesNicknames {
    public static void main(String[] args) {
        HashMap<String, String> people = new HashMap<>();
        people.put("matti", "mage");
        people.put("mikael", "mixu");
        people.put("arto", "arppa");

        String mikaelNickname = people.get("mikael");
        System.out.println("Mikael's nickname is: " + mikaelNickname);
    }
}
