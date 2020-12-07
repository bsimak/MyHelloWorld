import java.util.Calendar;
import java.util.Scanner;

public class MyHelloWorld {
    public static void main(String[] args) {

        String frage1 = "Hello, what's your name?";

        String jetzt = wieSpaet();
        zeigeUhrzeit(jetzt);
        gehFragen(frage1);
        String myName = gibAntwort();
        gehAntworten(myName);
    }
        static String wieSpaet() {
            Calendar c = Calendar.getInstance();
            int hour = c.get(Calendar.HOUR_OF_DAY);
            String hourf = String.format("%02d", hour);
            int minute = c.get(Calendar.MINUTE);
            String minutef = String.format("%02d", minute);
            String jetzt = hourf + ":" + minutef;
            return(jetzt);
    }
        static void zeigeUhrzeit(String jetzt) {
            System.out.println("Jetzt ist es: " + jetzt );
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

