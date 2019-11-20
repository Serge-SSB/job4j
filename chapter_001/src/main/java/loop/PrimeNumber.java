package loop;

import static loop.CheckPrimeNumber.check;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        for(int a = 2; a <= finish; a++) {
            boolean x = check(a);
            if (x)
            count++;
            }
        return count;
    }
}
