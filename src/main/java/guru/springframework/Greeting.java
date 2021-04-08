package guru.springframework;

/**
 * Created by jt on 10/10/18.
 */
public class Greeting {

    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld(String jordan){
        return HELLO + " " + WORLD;
    }

    public String helloWorld1(String name){
        return HELLO + " " + name;
    }
}
