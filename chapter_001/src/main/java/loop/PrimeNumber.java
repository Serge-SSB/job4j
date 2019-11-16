package loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        int i, j;
        boolean prime;
        for(i = 2; i <= finish; i++) {
            prime = true;
            // проверить, делится ли число без остатка
            for (j = 2; j < i; j++)
                // если число делится без остатка, значит, оно не простое
                if((i % j) == 0) prime = false;
            if (prime)
                count++;

            }

        return count;
    }
}
