package string;

/**
 * Created by ZoeLiu on 9/24/15.
 */
public class toHex {
    public String hex(int number) {
        // write your solution here
        assert(number >= 0);
        if(number == 0){
            return "0x0";
        }
        StringBuilder result = new StringBuilder();
        while (number != 0){
            int rem = number % 16;
            if (rem <= 9){
                result.append(Integer.toString(rem));
            }else{
                result.append(Character.toChars('A'+ rem - 10));
            }
            number /= 16;
        }

        result.append("x0");
        return result.reverse().toString();
    }
}
