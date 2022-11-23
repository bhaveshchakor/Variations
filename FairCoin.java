package __Variation__;

public class FairCoin
{

	public static void main(String[] args)
	{
		int[] a = { 2,3,5,6 };
		int n = 10;
		int counter = checkEle(a, n, 0, 0, 0);
		System.out.println(counter);
	}

	private static int checkEle(int[] a, int n, int i, int sum, int counter)
	{
		for (int j = i; j < a.length; j++)
		{
			int sum2=sum+a[j];
			if (sum2==n)
			{
				counter++;
			}
			else if(sum2>n)
			{
				continue;
			}
			else
			{
				counter=checkEle(a, n, j, sum2, counter);
			}
		}
		return counter;
	}

}
