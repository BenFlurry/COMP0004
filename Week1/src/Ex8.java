public class Ex8 {
    public static void main(String[] args) {
        new Ex8().menu();
    }

    public void printMenu() {
        System.out.println("Choose one of the below!");
        System.out.println("1. Convert mm to feet");
        System.out.println("2. Convert m to in");
        System.out.println("3. Convert km to yards");
        System.out.println("4. Quit");
        System.out.print(">> ");
    }

    public void menu() {
        Input inp = new Input();
        int choice = 0;
        while (choice != 4) {
            printMenu();
            choice = inp.nextInt();

            switch (choice) {
                case 1 -> millimetresToFeet();
                case 2 -> metresToInches();
                case 3 -> kmToYards();
            }
        }
    }

    public void millimetresToFeet() {

    }

    public void metresToInches() {

    }

    public void kmToYards() {

    }
}
