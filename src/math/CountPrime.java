package math;

import java.util.ArrayList;

/**
 * Created by ZoeLiu on 7/2/15.
 * Count the number of prime numbers less than a non-negative number, n.
 *
 * Design: non-prime could be divided into prime numbers, so we need a data structure to record current
 * existing prime. then use new number to divide it. This will exceed time limits
 *
 */
public class CountPrime {

    public  int countPrimes(int n) {
        if(n<=2)
            return 0;
        boolean[] primes = new boolean[n];
        for(int i=2;i<n;i++)
            primes[i] = true;
        for(int i=2;i<=Math.sqrt(n-1);i++){
            if(primes[i]){
                for(int j= i+i; j<n;j+=i)
                    primes[j] = false;
            }
        }
        int count = 0;
        for(int i=2;i<n;i++)
            if(primes[i])
                count++;
        return count;
    }
}
