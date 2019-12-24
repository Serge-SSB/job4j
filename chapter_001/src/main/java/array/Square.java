package array;

/**
 * Заполнение массива через цикл от 1 до bound возведенных в квадрат.
 * @author Serge Barsanov (s.b.stal.invest@gmail.ru)
 * @version $Id$
 * @since 0.1
*/

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 0; i < bound; i++) {
            rst[i] = (int) Math.pow(i + 1, 2);
            // заполнить массив через цикл элементами от 1 до bound возведенными в квадрат
        }
        return rst;
    }
}
