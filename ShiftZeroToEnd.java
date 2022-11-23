package __Variation__;

public class ShiftZeroToEnd
{
	// StartOfMainMethod
	public static void main(String[] args)
	{
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9 };
		myCode(arr);
	}
	// EndOfMainMethod
	private static void myCode(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] == 0)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Array after pushing zeros to the back:");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
