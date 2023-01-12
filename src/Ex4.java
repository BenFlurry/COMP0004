import java.util.Random;

public class Ex4 {
    public static void main(String[] args) {
        new Ex4().stats();

    }

    public void stats() {
        double sum = 0;
        double max = -1;
        double min = 1;
        Random rand = new Random(1234);

        for (int i = 0; i < 10_000; i++) {
            double val = rand.nextDouble(-1, 1);
            sum += val;
            if (val > max) {
                max = val;
            }
            else if (val < min) {
                min = val;
            }
        }
        double avg = sum / 10_000;
        System.out.println("avg = " + avg);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
