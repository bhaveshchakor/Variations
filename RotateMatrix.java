package __Variation__;

public class RotateMatrix
{

	// StartOfMainMethod
	public static void main(String[] args)
	{
		int[][] a = { { 1, 2 }, { 3, 4 } };
		myCode(a);
	}
	// EndOfMainMethod
	private static void myCode(int[][] a)
	{
		// WriteCode Here
		int imin = 0;
		int jmin = 0;
		int imax = a.length - 1;
		int jmax = a.length - 1;
		while (jmin < jmax)
		{
			int temp = a[imin][jmin];
			for (int j = jmin; j < jmax; j++)
			{
				a[imin][j] = a[imin][j + 1];
			}
			for (int i = imin; i < imax; i++)
			{
				a[i][jmax] = a[i + 1][jmax];
			}
			for (int j = jmax; j > jmin; j--)
			{
				a[imax][j] = a[imax][j - 1];
			}
			for (int i = imax; i > imin; i--)
			{
				a[i][jmin] = a[i - 1][jmin];
			}
			a[imin + 1][jmin] = temp;
			imin++;
			imax--;
			jmin++;
			jmax--;
		}
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
