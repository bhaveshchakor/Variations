package __Variation__;

public class PrintPattern 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n=4;
		myCode(n);
	}
	//EndOfMainMethod
	public static void myCode(int n) 
	{
		//write code here or  logic
		int count=n;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<count;k++)
				{
					System.out.print(n-j+" ");
				}
			}
			count--;
			System.out.println();
		}
	}
}
/*
4 4 4 4 3 3 3 3 2 2 2 2 1 1 1 1 
4 4 4 3 3 3 2 2 2 1 1 1 
4 4 3 3 2 2 1 1 
4 3 2 1 

*/