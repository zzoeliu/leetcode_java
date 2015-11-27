package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ZoeLiu on 9/21/15.
 */
public class Anagram {
    public List<Integer> allAnagrams(String s, String l) {
        // Write your solution here.
        /*List<Integer> result = new ArrayList<Integer>();
        if (l.length() == 0 || l.length() < s.length())
            return result;
        int m = l.length();
        int n = s.length();
        for(int i = 0; i <= m - n; i++){
            String temp = l.substring(i, i + n);
            if (isAnagrams(temp, s)){
                result.add(i);
            }
        }
        return result;
    }
    private boolean isAnagrams(String s, String l){
        if (s.length() != l.length())
            return false;
        char[] larray = new char[26];
        for (int i = 0; i < l.length(); i++){
            larray[l.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++){
            larray[s.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++){
            if (larray[i] != 0)
                return false;
        }
        return true;*/
        if (s == null || l == null){
            return null;
        }
        List<Integer> result = new ArrayList<Integer>();
        if (s.length() == 0 || l.length() == 0 || l.length() < s.length()){
            return result;
        }
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            }else{
                map.put(s.charAt(i), 1);
            }
        }
        int match = 0;
        for (int i = 0; i< l.length(); i++){
            char cur = l.charAt(i);
            Integer count = map.get(cur);
            if (count != null){// check if the current character match, if so the match length increase
                map.put(cur,count-1);
                if (count == 1){
                    match++;
                }
            }
            if (i >= s.length()){
                char tmp = l.charAt(i - s.length());
                Integer tempCount = map.get(tmp);
                if (tempCount != null){
                    map.put(tmp,tempCount + 1);
                    if (tempCount == 0){//maitain a substring of length s, the head of substring is extra, we need to deduct from the counted match(cause we execute match++ before)
                        match--;
                    }
                }
            }
            if (match == map.size()){
                result.add(i - s.length() + 1);
            }
        }
        return result;
    }
}
