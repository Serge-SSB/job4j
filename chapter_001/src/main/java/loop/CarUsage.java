package loop;

public class CarUsage {
    public static void main(String[] args) {
        ru.job4j.Calculator.Car audi = new ru.job4j.Calculator.Car();
        if (!audi.canDrive()) {
            audi.fill(10);
        }
        int km = 0;
        while (audi.canDrive()) {
            audi.drive(1);
            km++;
            if (km == 4) {
                audi.drive(1);
                continue;
            }
            if (km == 6) {
                break;
            }
        }
        audi.gasInfo();
    }
}
