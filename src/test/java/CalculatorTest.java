import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest  {

    Calculator cal;
    @Before
    public void init(){
        cal = new Calculator();
    }

    @Test
    public void testAdd(){
        int x = 10;
        int y = 20;
        assertEquals(30, cal.add(x,y));
    }

    @Test
    public void testSub(){
        int x = 10;
        int y = 20;
        assertEquals(-10,cal.sub(x,y));
    }


    @Test(expected = ArithmeticException.class)
    public void testDivide(){
        Assert.assertEquals(2,cal.divide(4,2));

    }

    @Ignore("Not yet implemented")
    @Test
    public void testMulti(){


    }

    @Test(expected = ArithmeticException.class,timeout=2000)
    public void testMultiply(){
        Assert.assertEquals(200,cal.multiply(4,2));


    }
}
