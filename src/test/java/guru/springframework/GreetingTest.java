package guru.springframework;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

class GreetingTest {

    private Greeting greeting;
    @BeforeAll
    public static void beforeClass() {
        System.out.println("Before - I am only called Once !!!");
    }
    @BeforeEach
    void setUp() {
        System.out.println("In Before Each...");
        greeting = new Greeting();
    }

    @org.junit.jupiter.api.Test
    void helloWorld() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld("jordan"));
    }

    @org.junit.jupiter.api.Test
    void helloworld1() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld1("jordan"));
    }
    @org.junit.jupiter.api.Test
    void helloworld2() {
        Greeting greeting = new Greeting();
        System.out.println(greeting.helloWorld1("willy"));
    }
    @AfterEach
    void tearDown(){
        System.out.println("In After each... ");
    }
    @AfterAll
    public static void afterClass(){
        System.out.println("After!!! ***  - I am only called Once!!!");
    }
}