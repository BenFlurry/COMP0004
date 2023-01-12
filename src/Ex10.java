public class Ex10 {
    public static void main(String[] args) {
        System.out.println(Ex10.filterInput());
    }

    public static String filterInput() {
        System.out.println("Enter a string: ");
        return new Input()
                .nextLine()
                .toUpperCase()
                .replace("!", "")
                .replace(" ", "")
                .replace(".", "")
                .replace(",", "");

    }
}
