import java.util.ArrayList;
import java.util.Collections;

public class Ex12 {
    public static void main(String[] args) {
        Ex12 x = new Ex12();
        x.output(reverseArr(getLines()));

    }

    public static ArrayList<String> getLines() {
        ArrayList<String> arr = new ArrayList<String>();
        FileInput inp = new FileInput("Week1/src/words.txt");
        while (inp.hasNextLine()) {
            arr.add(inp.nextLine());
        }
        return arr;
    }

    public static ArrayList<String> reverseArr(ArrayList<String> arr) {
        Collections.reverse(arr);
        System.out.println(arr);
        for (int i = 0; i < arr.size(); i++) {
            String current = arr.get(i);
            String reversed = "";

            for (int j = 0; j < current.length(); j++) {
                reversed = current.charAt(j) + reversed;
            }
            System.out.println(current);
            System.out.println(reversed);

            arr.set(i, reversed);
        }
        System.out.println(arr);
        return arr;
    }

    public static void output(ArrayList<String> arr) {
        FileOutput out = new FileOutput("Week1/src/words.txt");
        out.writeEndOfLine();
        out.writeString("---------------------------------\n");
        for (int i = 0; i < arr.size(); i++) {
            out.writeString(arr.get(i));
            out.writeEndOfLine();
        }
        out.close();
    }
}
