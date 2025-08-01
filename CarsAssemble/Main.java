package exercism.CarsAssemble;

public class Main {

    public static void main(String[] args) {

          class CarsAssemble {

            public double productionRatePerHour(int speed) {

                final double numberFix = 221;
                final double calc = ((speed * numberFix) / 100);
                double result;

                if (speed >= 5 && speed <= 8) {
                    result = calc * 90;
                    return result;
                } else if (speed >= 1 && speed <= 4) {
                    result = calc * 100;
                    return result;
                } else if (speed == 9) {
                    result = calc * 80;
                    return result;
                } else if (speed == 10) {
                    result = calc * 77;
                    return result;
                } else {
                    return speed;
                }
            }

            public int workingItemsPerMinute(int speed) {

                final int numberFix = 221;
                final int calc = ((speed * numberFix) / 100);
                int result;

                if (speed >= 5 && speed < 8) {
                    result = (calc * 90) / 60;
                    return result;
                } else if (speed == 8) {
                    result = (calc * 90) / 58;
                    return result;
                } else if (speed >= 1 && speed <= 4) {
                    result = (calc * 100) / 60;
                    return result;
                } else if (speed == 9) {
                    result = (calc * 80) / 58;
                    return result;
                } else if (speed == 10) {
                    result = (calc * 77) / 60;
                    return result;
                } else {
                    return speed;
                }
            }
        }

    }
}
