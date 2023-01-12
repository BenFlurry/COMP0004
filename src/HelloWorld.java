import java.util.Random;
import java.lang.Math;

public class HelloWorld {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.sayHi();
        hello.say3Hi();
        hello.arr();
        hello.strings();
        hello.randomNumbers();
    }

    public void sayHi() {
        System.out.println("Hello World");
    }

    public void say3Hi() {
        for (int i = 0; i < 3; i++) {
            System.out.print(i+1);
            System.out.println(": Hello World!");
        }
    }

    public void arr() {
        int[] myArr = {1,2,3,4,5};
        int[] otherArr = new int[]{1,2,3,4,5};
        for (int i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }

        // not working properly
//        for (int n: otherArr) {
//            System.out.println(otherArr[n]);
//        }


    }

    public void strings() {
        String hello = "hello";
        String world = "World";
        String Hello = "Hello";
        boolean eq = hello.equals(world);
        boolean eqNoCase = hello.equalsIgnoreCase(Hello);

        System.out.print("Does hello = world: ");
        System.out.println(eq);
        System.out.print("Does hello = Hello ignoring case: ");
        System.out.println(eqNoCase);


        String a = "a";
        String b = "b";
        System.out.print("comparing a to b: ");

        // can use compareToIgnoringCase as well
        System.out.println(a.compareTo(b));

        // this outputs -1 as a is 1 less than b in ascii value

        System.out.print("the char at index 2 is: ");
        System.out.println(hello.charAt(2));

    }

    public void randomNumbers() {
        int seed = 1234;
        Random randNum = new Random(seed);


        for (int i = 0; i < 10; i++) {
            System.out.println(randNum.nextInt(1,100));
        }

        // another way to make a random float from 0 to 1:
        int min = 1;
        int max = 10;
        double randomDouble = Math.random();
        int randomInt = (int)(Math.random() * (max - min + 1)) + min;
        System.out.println(randomInt);
        System.out.println(randomDouble);

    }

}
