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
        float expected = 12.0f;
        assertEquals(expected, actual);
        
    }

}
