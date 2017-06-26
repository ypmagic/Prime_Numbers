/**
 * Created by young on 5/16/17.
 */

import java.util.*;

public class PrimeNumbers {

    private int num;

    public PrimeNumbers (int bound) {
        this.num = bound;
    }

    public boolean[] primeSieve () {
        boolean[] sieve = new boolean[this.num];
        Arrays.fill(sieve, true);
        sieve[0] = sieve[1] = false;
        for (int i = 2; i < this.num; i++) {
            if (sieve[i]) {
                for (int k = 2; i*k < this.num; k++) {
                    sieve[i*k] = false;
                }
            }
        }
        return sieve;
    }


}
