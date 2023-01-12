import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 x = new Ex2();
        x.findAverage(makeArr());
    }

    public static ArrayList<Double> makeArr() {
        ArrayList<Double> arr = new ArrayList<Double>();
        Input inp = new Input();
        int len = 10;
        for (int i = 0; i < len; i++) {
            System.out.print("Enter the " + (i+1) + "th value: ");
            arr.add(inp.nextDouble());
        }
        return arr;
    }
    
    public static double findAverage(ArrayList<Double> arr) {
        double sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }
        double average = sum / arr.size();
        System.out.println("average is; " + average);
        return average;
    }
}
