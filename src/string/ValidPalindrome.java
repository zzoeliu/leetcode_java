package string;

/**
 * Created by ZoeLiu on 7/2/15.
 * problem description:
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 For example,
 "A man, a plan, a canal: Panama" is a palindrome.
 "race a car" is not a palindrome.

 Note:
 Have you consider that the string might be empty? This is a good question to ask during an interview.

 For the purpose of this problem, we define empty string as valid palindrome.
 * Diffuculty Level: 2
 * Frequency Level : 5
 * Algorithms : string
 *
 * Design:
 * 1.null string and string length==1 true
 * 2.non-alphabetic letters, we also need to consider numbers
 * 3.lower case && capital is the same
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        int i=0,j=s.length()-1;
        if(s.length()<2) return true;

        while(i<j)
        {
            while((i<s.length()-1) && !isAlphabetic(s.charAt(i)))
            {
                i++;
            }
            while((j>0) && !isAlphabetic(s.charAt(j)))
            {
                j--;
            }
            if(i>=j) break;// This is an important boundary condition. We need to Guarantee that i<j
            if(!isSame(s.charAt(i),s.charAt(j)))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public boolean isAlphabetic(char a)
    {
        if((a>='a'&&a<='z')||(a>='A'&&a<='Z')||(a>='0'&&a<='9'))
        {
            return true;
        }
        else return false;
    }
    public boolean isSame(char a,char b)
    {
        if(Character.toLowerCase(a)==Character.toLowerCase(b) || a==b)
            return true;
        else return false;
    }
}
