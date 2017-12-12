package math.operation;

public class ArithmeticOperations {

	public Integer add(Integer a, Integer b)
	{
		return a+b;
	}
	
	public Integer substract(Integer a, Integer b)
	{
        return a-b;
	}

	public Integer multiply(Integer a, Integer b)
	{
		return a*b;
	}
	
	public float divide(Integer a, Integer b)
	{
        return (float) a/b;
	}
	
	public int exponent(int a, int b)
	{
        return (int) Math.pow(a,b);
	}
}
