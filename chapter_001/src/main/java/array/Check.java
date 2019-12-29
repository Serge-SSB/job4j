package array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean check : data) {
            if (data[0] != check) {
                result = false;
                break;
            }
        }
        return result;
    }
}