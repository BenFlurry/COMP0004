public class Ex9 {
    public static void main(String[] args) {
        new Ex9().palindrome();
    }

    public void palindrome() {
        System.out.print("enter a val: ");
        Input inp = new Input();
        long val = inp.nextLong();
        String strVal = "" + val;
        int len = strVal.length();
        int i = 0;
        while (i <= len/2 + 1) {
            if (strVal.charAt(i) != strVal.charAt(len - i -1)) {
                System.out.println("this is not a palindrome");
                return;
            }
            i++;
        }
        System.out.println("this is a palindrome");

    }

}
