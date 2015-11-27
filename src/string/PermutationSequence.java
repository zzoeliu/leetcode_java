package string;

import java.util.ArrayList;

/**
 * Created by ZoeLiu on 7/16/15.
 */
public class PermutationSequence {
    public String getPermutation(int n, int k) {
        k--;
        StringBuilder results = new StringBuilder();
        ArrayList<Integer> numList = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {//Used to record the available number
            numList.add(i);
        }
        int factorial = 1;
        int i = n;
        while (i != 0) {
            factorial *= i;
            i--;
        }
        int j = n - 1;
        while (j >= 0) {
            int index = k / factorial;
            results.append(numList.get(index));
            numList.remove(index);
            k = k % factorial;
            if (j != 0)
                factorial /= j;

            j--;

        }
        return results.toString();
    }
}
