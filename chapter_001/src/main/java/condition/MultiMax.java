package condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int res = (first > third) ? first : third;
        return (second > res) ? second : res;
    }
}
