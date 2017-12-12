package math.operation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticOperationsTest {
	

	@Test
	public void testAdd()
	{
	
		ArithmeticOperations operations = new ArithmeticOperations();
		Integer actual = operations.add(2, 6);
		Integer expected = 8;
		assertEquals(expected, actual);
		
	}
	
	@Test
    public void testSubstract()
    {
    
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.substract(6, 2);
        Integer expected = 4;
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void testMultiply()
    {
    
        ArithmeticOperations operations = new ArithmeticOperations();
        Integer actual = operations.multiply(6, 2);
        Integer expected = 12;
        assertEquals(expected, actual);
        
    }
    
    @Test
    public void testDivide()
    {
    
        ArithmeticOperations operations = new ArithmeticOperations();
        float actual = operations.divide(6, 2);
        float expected = 3.0f;
        assertEquals(expected, actual,0.0001f);
        
    }
    
    @Test
    public void testPower()
    {
    
        ArithmeticOperations operations = new ArithmeticOperations();
        int actual = operations.exponent(6, 2);
        int expected = 36;
        assertEquals(expected, actual);
        
    }

}
