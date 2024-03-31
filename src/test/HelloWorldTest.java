package test;
import static org.junit.Assert.assertEquals;
import org.junit.*;
import main.HelloWorld;

public class HelloWorldTest {

    @Test
    public void testHelloWorld(){
        HelloWorld hw = new HelloWorld();
        String result = hw.sayHello("Greg");
        assertEquals(result, "Hello, Greg!");
    }
}
