package index;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _30 {

    public static void main(String[] args){
        _30 instance = new _30();


        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word","good","best","good"};
        System.out.println(instance.findSubstring(s,words));
    }

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || words == null) {
            return result;
        }
        if (words.length == 0) {
            return result;
        }
        int wordLen = words[0].length();
        int sLen = s.length();
        int wordCnt = words.length;

        if (s.length() < wordLen * words.length) {
            return result;
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word,0) + 1);
        }

        int startIndex = 0;
        int cnt = 0;
        Map<String, Integer> clone = new HashMap<>(map);
        while (startIndex <= sLen - wordLen * wordCnt) {
            if (cnt == 0) clone = new HashMap<>(map);
            if (cnt == wordCnt) {
                result.add(startIndex);
                cnt = 0;
                startIndex += 1;
                clone = new HashMap<>(map);
                continue;
            }
            String cur = startIndex + (cnt + 1) * wordLen == sLen ?
                    s.substring(startIndex + cnt * wordLen) :
                    s.substring(startIndex + cnt * wordLen, startIndex + (cnt + 1) * wordLen);
            if (clone.containsKey(cur) && clone.get(cur) > 0) {
                clone.put(cur,clone.get(cur) - 1);
                cnt++;
            } else {
                startIndex++;
                cnt = 0;
            }
        }

        return result;
    }
}
