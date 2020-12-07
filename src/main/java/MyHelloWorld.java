import java.util.Scanner;

public class MyHelloWorld {
    public static void main(String[] args) {

        String frage1 = "Hello, what's your name?";
        String nobody = "nobody";

        gehFragen(frage1);
        String myName = gibAntwort();
        gehAntworten(myName);
    }
        static void gehFragen(String frage1) {
            System.out.println(frage1);
        }
        static String gibAntwort() {
            Scanner scan = new Scanner(System.in);
            String name = scan.next();
            scan.close();
            return(name);
        }
        static void gehAntworten(String myName) {
            System.out.println("Hello " + myName + ", still busy?");
        }
    }

