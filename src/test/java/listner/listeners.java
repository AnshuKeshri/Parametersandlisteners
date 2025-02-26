package listner;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

@Listeners(listner.listenerdemo.class)
public class listeners {

    @Test
    public void test1() {
        System.out.println("I am inside Test 1");
    }

    @Test
    public void test2() {
        System.out.println("I am inside Test 2");
        assertTrue(false, "Intentionally failing test 2 to check listener");
    }

    @Test
    public void test3() {
        System.out.println("I am inside Test 3");
    }
}
