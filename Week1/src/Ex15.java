public class Ex15 {
    public static void main(String[] args) {
        new Ex15().range(-7, -4);
    }

    public static void range(int start, int end) {
        double val = 1;
        for (int i = start; i < end; i++) {
            val *= i;
        }
        System.out.println(val);
    }
}
