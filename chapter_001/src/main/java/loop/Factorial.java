package loop;

public class Factorial {
    public int calc(int n) {
        int result = 1;
        for (; n != 0; n--){
            result *= n;
            }
        return result;
    }
}
