package loop;

public class CheckPrimeNumber {
    public boolean check(int finish) {
        boolean prime = false;
        if (finish < 2) prime = false;
        else prime = true;
        for (int i = 2; i <= (finish - 1); i++) {
            if ((finish % i) == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}