package bsi.myhelloworld;

import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Scanner;
import java.lang.Thread;
import java.time.format.DateTimeFormatter;
import static java.lang.System.out;


public class MyHelloWorld {
    public static void main(String[] args) throws InterruptedException {

        int eins = 1;
        int zwei = 2;
        String frage1 = "Hello, what's your name?";
        String nobody = "nobody";
        int dauer = 1000;

        String jetzt = wieSpaet(eins);
        zeigeUhrzeit(jetzt);

        gehFragen(frage1);
        String myName = gibAntwort(nobody, dauer);
        gehAntworten(myName);

        jetzt = wieSpaet(zwei);
        zeigeUhrzeit(jetzt);
    }
        static String wieSpaet(int variante) {
            if (variante == 1)  {
                Calendar c = Calendar.getInstance();
                int hour = c.get(Calendar.HOUR_OF_DAY);
                String hh = String.format("%02d", hour);
                int minute = c.get(Calendar.MINUTE);
                String mm = String.format("%02d", minute);
                return (hh + ":" + mm);
            }
            if (variante == 2) {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
                return (dtf.format(ZonedDateTime.now()));
            }
                return ("heute keine Uhrzeit");
         }
        static void zeigeUhrzeit(String jetzt) {
            out.println("Jetzt ist es: " + jetzt );
        }

        static void gehFragen(String frage1) {
            out.println(frage1);
        }
        static String gibAntwort(String nobody, int dauer) throws InterruptedException {
            Scanner scan = new Scanner(System.in);
            String name = nobody;
            name = scan.next();
            scan.close();
            Thread.sleep(dauer);
            return(name);
        }
        static void gehAntworten(String myName) {
            out.println("Hello " + myName + ", still busy?");
        }
}

