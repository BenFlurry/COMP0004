public class Ex7 {
    public static void main(String[] args) {
        Ex7 x = new Ex7();
        x.handleInput();

    }

    public void handleInput() {
        Input inp = new Input();
        System.out.print("enter the integer: ");
        int val = inp.nextInt();
        System.out.print("enter the base: ");
        int base = inp.nextInt();

        String convertedVal = toBase(val, base);
    }

    public String toBase(int n, int b) {
        // find the order of the given value in the new base using logs and base swap formula
        int sigfig = (int)(Math.ceil((Math.log(n)/Math.log(b))));

        String convertedVal = "";
        for (int i = 0; i < sigfig; i++) {
            int digit = n % b;
            n /= b;
            convertedVal = digit + convertedVal;
        }
        System.out.println(convertedVal);
        return convertedVal;

    }
}
