package week6.HashMaps.Task3;

import week3.DbConnect;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> words;

    public Dictionary(){
        this.words = new HashMap<>();
    }

    public String translate(String word){
        return words.getOrDefault(word, null);
    }

    public void add(String word, String translation){
        words.put(word, translation);
    }

    public int amoutOfWords(){
        return words.size();
    }

    public ArrayList<String> translationList(){
        ArrayList<String> translations = new ArrayList<>();
        for (String key : words.keySet()){
            translations.add(key + " = " + words.get(key));
        }
        return translations;
    }
}
