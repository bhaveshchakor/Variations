package __Variation__;

public class Frequncy
{

	public static void main(String[] args)
	{
		int[] a = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 65, 65 };
		int value = a[0];
		int count = 1;

		for (int i = 1; i < a.length; i++)
		{
			if (value == a[i])
			{
				count++;
			}
			else
			{
				if (count == 1)
				{

					System.out.println(value);
					break;
				}
				else
				{
					value = a[i];
					count = 1;
				}
			}
		}

	}

}
