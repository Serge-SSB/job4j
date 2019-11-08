package condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int res = (first > second) ? first : second;
        return (res > third) ? res : third;
    }
}
