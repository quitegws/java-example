package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

/**
 * @Author: gws
 * @Date: 16/08/2018 21:28
 * @Description:
 */
public class TopN {
    private static final int RANGE = 1000;


    public static void main(String[] args) {
        int wordsCount = 100000;

        List<String> words = new ArrayList<>();

        for (int i = 0; i < wordsCount; i++) {
            String word = getWord(i);
            words.add(word);
        }

        HashMap<String,Integer> map = new HashMap<>();
        for (int i = 0; i < wordsCount; i++) {
            map.put(words.get(i),map.getOrDefault(words.get(i), 0) + 1);
        }



    }



    public static String getWord(int i ){
        return String.valueOf(new Random().nextInt(RANGE));
    }
}
