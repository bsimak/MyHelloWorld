package bsi.myhelloworld;

import static org.junit.jupiter.api.Assertions.*;

class MyHelloWorldTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("JUnit4To5.beforeEach");
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("JUnit4To5.AfterEach");
    }

    @org.junit.jupiter.api.Test
    void wieSpaet() {
        System.out.println("JUnit4To5.Test wieSpaet");
    }

    @org.junit.jupiter.api.Test
    void zeigeUhrzeit() {
        System.out.println("JUnit4To5.Test zeigeUhrzeit");
    }

    @org.junit.jupiter.api.Test
    void gehFragen() {
    }

    @org.junit.jupiter.api.Test
    void gibAntwort() {
        System.out.println("JUnit4To5.Test gibAntwort");
    }

    @org.junit.jupiter.api.Test
    void gehAntworten() {
        System.out.println("JUnit4To5.Test gehAntworten");
    }
}