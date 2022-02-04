import static org.junit.Assert.*;
import org.junit.*;

public class MyMultiTest {
    @Test
    public void TestMulti(){
        assertEquals(10, MyMulti.myMulti(2, 5));
    }
}
