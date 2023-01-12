import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Ex3 {
    public static void main(String[] args) {
        ArrayList<String> arr = new Ex3().reverseSort();
        System.out.println(arr);
    }

    public ArrayList<String> reverseSort() {
        ArrayList<String> arr = new Ex1().inputString();
        Collections.sort(arr);
        Collections.reverse(arr);

        return arr;
    }
}
