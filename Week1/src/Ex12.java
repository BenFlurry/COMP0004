import java.util.ArrayList;

public class Ex12 {
    public static void main(String[] args) {
        new Ex12().getLines();
    }

    public ArrayList<String> getLines() {
        ArrayList<String> arr = new ArrayList<String>();
        FileInput inp = new FileInput("src/words.txt");
        while (inp.hasNextLine()) {
            arr.add(inp.nextLine());
        }
        return arr;
    }

    public void reverseArr(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            String line = arr.get(i);
            System.out.println("test");

        }
    }
}
