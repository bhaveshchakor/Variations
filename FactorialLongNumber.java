package __Variation__;
import java.math.*;
public class FactorialLongNumber
{

	static int i = 1;
	// StartOfMainMethod
	public static void main(String[] args)
	{
		long num = 6;
		myCode(num);
	}
	// EndOfMainMethod
	private static void myCode(long num)
	{
		BigInteger fact = findFact(num);
		System.out.println(fact);
	}
	private static BigInteger findFact(long num)
	{
		BigInteger b = new BigInteger("1");
		while (num > 0)
		{
			b = b.multiply(BigInteger.valueOf(num));
			num--;
		}
		return b;

	}
}