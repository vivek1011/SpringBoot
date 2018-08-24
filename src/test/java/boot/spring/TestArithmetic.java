package boot.spring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestArithmetic {

    @Before
    public void beforeClass(){
        /*
        *  runs before every test beginning...
        * */
    }

    @Test
    public void testAddition() {
        String a = "1"; String b = "1";
        assertEquals(a ,b );
    }

    @After
    public void afterClass(){
        /*runs after every test ending...
        * */
    }
}