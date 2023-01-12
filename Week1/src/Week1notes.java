public class Week1notes {
    public static void main(String[] args) {
        Week1notes w = new Week1notes();
//        w.Ex1();
//        w.Ex2();
        w.Ex3();
    }

    public void Ex1() {
        inputAndProcess(new Input());
    }

    // ex 1.1
    public int sumOfDigits(int n) {
        int tmp = n;
        n = Math.abs(n);
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of the digits of " + tmp + " is " + sum);
        return sum;
    }

    // Ex 1.1 cont
    public void inputAndProcess(Input inp) {
        System.out.print("Enter your number: ");
        int n = inp.nextInt();
        sumOfDigits(n);

    }

    // Ex 1.2

    public void Ex2() {
        readFile(getFilename());
    }

    public String getFilename() {
        Input inp = new Input();
        System.out.print("Enter the file name: ");
        return inp.nextLine();
    }

    public void readFile(String filename) {
        FileInput inp = new FileInput(filename);
        while (inp.hasNextLine()) {
            System.out.println(inp.nextLine());
        }
        inp.close();
    }

    public void Ex3() {
        doTable(validateTable());
    }

    // Ex 1.3
    public int validateTable() {
        while (true) {
            System.out.print("Enter a number: ");
            int val = new Input().nextInt();
            if (val >= 2 && val <= 12) {
                return val;
            } else {
                System.out.println("Number needs to be in the range of 2 and 12 inclusive");
            }
        }
    }

    public void doTable(int val) {
        for (int i = 0; i < 13; i++) {
            System.out.println(val + " * " + i + " = " + (val*i));
        }
    }

}
