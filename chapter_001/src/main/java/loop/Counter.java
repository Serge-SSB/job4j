package loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        for (start = 0; start <= finish; start++){
            if (start % 2 == 0) {
                sum += start;
            }
        }
        return sum;
    }
}
