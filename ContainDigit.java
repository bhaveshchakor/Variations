package __Variation__;

public class ContainDigit
{

	public static void main(String[] args)
	{
		int n=30;
		int d=2;
		
		for (int i = 0; i < n; i++)
		{
			if (i==d)
			{
				System.out.print(i+" ");
			}
			else if (i%10==d) {
				System.out.print(i+" ");
			}
			else if (i/10==d) {
				System.out.print(i+" ");
			}
		}
	}

}
