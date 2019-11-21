package loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
           double percentYear = amount / 100 * percent;
           amount += percentYear - salary;
           year++;
        }

        return year;
    }
}
