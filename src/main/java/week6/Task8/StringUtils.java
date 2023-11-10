package week6.Task8;

public class StringUtils {
    public static boolean included(String word, String searched){
        if(word == null || searched == null){
            return false;
        }

        //Trim & Convert to Uppercase
        String wordTrimmedUpper = word.trim().toUpperCase();
        String searchedTrimmedUpper = searched.trim().toUpperCase();

        return  wordTrimmedUpper.contains(searchedTrimmedUpper);
    }
}
