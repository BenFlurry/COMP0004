import java.util.Arrays;
import java.util.Collections;

public class Ex16 {
    public static void main(String[] args) {
        new Ex16().same_chars("hello".toCharArray(), "hello1".toCharArray());
    }

    public void same_chars(char[] c1, char[] c2) {
        Arrays.sort(c1);
        Arrays.sort(c2);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(Arrays.equals(c1, c2));
    }
}
