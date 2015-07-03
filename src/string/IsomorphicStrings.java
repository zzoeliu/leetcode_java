package string;

/**
 * Created by ZoeLiu on 7/2/15.
 *
 * Given two strings s and t, determine if they are isomorphic.

 Two strings are isomorphic if the characters in s can be replaced to get t.

 All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

 For example,
 Given "egg", "add", return true.

 Given "foo", "bar", return false.

 Given "paper", "title", return true.

 Note:
 You may assume both s and t have the same length.

 Design: Use hash map to store <s,t> pair
 we should judge by char at certain position ,not by position of certain value
 */
public class IsomorphicStrings {
    HashMap<Character,Character> map = new HashMap<>();
    for (int i=0; i<s.length(); i++){
        if (map.containsKey(s.charAt(i))){//Returns true if this map maps one or more keys to the specified value.
            if (t.charAt(i)==map.get(s.charAt(i))) continue;
            else return false;
        }
        else if (map.containsValue(t.charAt(i))) return false;
        map.put(s.charAt(i),t.charAt(i));//s is key, t is value
    }
    return true;

}
