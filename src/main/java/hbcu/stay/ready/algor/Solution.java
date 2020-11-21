package hbcu.stay.ready.algor;

import java.util.*;

public class Solution {
    public boolean canConstruct(String ransomNoteText, String magazineText){

        String[] ransomNoteArray = ransomNoteText.split(" ");
        Map<String, Integer> magazineWordCount = new HashMap<>();
        String[] magazineArray = magazineText.split(" ");

        for (String word : magazineArray) {
            if (magazineWordCount.containsKey(word)) {
                Integer count = magazineWordCount.get(word) + 1;
                magazineWordCount.put(word, count);
            } else
                magazineWordCount.put(word, 1);
            }

            for (String word : ransomNoteArray) {
                if(magazineWordCount.containsKey(word)==false)
                 return false;
            int count = magazineWordCount.get(word);
            if (count ==0)
                return false;
            magazineWordCount.put(word, count-1);
        }
        return true;
    }
}


