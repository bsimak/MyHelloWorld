package bsi.myhelloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MyHelloWorldTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Setup beforeEach");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("tearDown AfterEach");
    }

    @org.junit.jupiter.api.Test
    void wieSpaet() {
        System.out.println("Test wieSpaet");
    }

    @org.junit.jupiter.api.Test
    void zeigeUhrzeit() {
        //Test will pass
        System.out.println("Test zeigeUhrzeit");
        int jetzt = 1;
        Assertions.assertEquals(jetzt, 1);
    }

    @org.junit.jupiter.api.Test
    void gehFragen() {
        System.out.println("Test gehFragen");
    }

    @org.junit.jupiter.api.Test
    void gibAntwort() {
        System.out.println("Test gibAntwort");
    }

    @org.junit.jupiter.api.Test
    void gehAntworten() {
        System.out.println("Test gehAntworten");
    }

    @Test
    void welcherTest() {
        System.out.println("welcher Test?");
    }
}