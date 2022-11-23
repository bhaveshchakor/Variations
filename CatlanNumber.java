package __Variation__;

public class CatlanNumber 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 5;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		for(int i=0;i<n;i++)
		{
			int count=makeEqu(0,"",i*2);
			System.out.print(count+" ");
		}
	}
	public static int makeEqu(int count, String eq, int len)
	{
		if(eq.length()==len)
		{
			//System.out.println(eq);
			count++;
			return count;
		}
		if(cntOfOpenLimit(eq,len))
		{
			count=makeEqu(count,eq+"(",len);
		}
		if(isOpenCntGreat(eq))
		{
			count=makeEqu(count,eq+")",len);
		}
		return count;
	}
	public static boolean isOpenCntGreat(String eq)
	{
		int opening=0;
		int closing=0;
		for(int i=0;i<eq.length();i++)
		{
			if(eq.charAt(i)=='(')
			opening++;
			else
			closing++;
		}
		if(opening>closing)
		{
			return true;
		}
		return false;
	}
	public static boolean cntOfOpenLimit(String eq, int len)
	{
		int count=0;
		for(int i=0;i<eq.length();i++)
		{
			if(eq.charAt(i)=='(')
			count++;
		}
		if(count<len/2)
		{
			return true;
		}
		return false;
	}
}
