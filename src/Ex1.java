import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        Ex1 x = new Ex1();
        x.stuff();
    }

    public ArrayList<String> inputString() {
        ArrayList<String> arr = new ArrayList<String>();
        Input inp = new Input();
        String str = "";
        while (str.compareTo("stop") != 0) {
            System.out.print("enter a string: ");
            str = inp.nextLine();
            arr.add(str);
        }
        System.out.println(arr);
        return arr;
    }

    public void stuff() {
        ArrayList<String> arr = inputString();
        System.out.println(arr.get(1));
        System.out.println(arr.set(1, "no"));
        System.out.println(arr.get(1));
        System.out.println(arr);

    }

}
