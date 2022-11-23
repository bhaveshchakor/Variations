package __Variation__;

import java.util.*;

public class PendulmOrder
{
	// StartOfMainMethod
	public static void main(String[] args)
	{
		int[] a = { 1, 3, 2, 5, 4 };
		int n = a.length;
		myCode(a, n);
	}
	// EndOfMainMethod
	public static void myCode(int[] a, int n)
	{
		// write code here
		Arrays.sort(a);
		int index = (a.length - 1) / 2;			
		int diff = 1;
		int addOrsub = 1;
		int[] b = new int[a.length];
		for (int ele : a)
		{
			b[index] = ele;
			if (addOrsub == 1)
			{
				index = index + diff;
				addOrsub = 0;
			}
			else
			{
				index = index - diff;
				addOrsub = 1;
			}
			diff++;
		}
		System.out.println(Arrays.toString(b));
	}
}
