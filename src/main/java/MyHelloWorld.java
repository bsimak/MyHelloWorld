import java.util.Scanner;

public class MyHelloWorld {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, what's your name?");
        String name = scan.next();
        System.out.println("Hello " + name + ", still busy?");
        scan.close();
    }
}
