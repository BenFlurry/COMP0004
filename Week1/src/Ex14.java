public class Ex14 {
    public static void main(String[] args) {
        new Ex14().centre("Benjamin Alexander");
    }

    public static String centre(String name) {
        int start = 40-(int)(name.length() / 2);
        String out = "|";

        for (int i = 0; i < start; i++) {
            out += ".";
        }

        for (int i = 0; i < name.length(); i++) {
            out += name.charAt(i);
        }

        for (int i = 0; i < start; i++) {
            out += ".";
        }

        out += "|";
        System.out.println(out);
        return out;
    }
}
