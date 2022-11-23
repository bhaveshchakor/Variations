package __Variation__;
public class MaxOddSum 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		int[] a= 
		{
			4, -3, 3, -5
		}
		;
		int n=a.length;
		myCode(a,n);
	}

	public static void myCode(int[] a,int n) 
	{
		
		int max=0;
		int start=1;
		int end=(int)(Math.pow(2, a.length));
		for(int i=start;i<end;i++)
		{
			String bs=Integer.toBinaryString(i);
			while(bs.length()<a.length)
			{
				bs='0'+bs;
			}
			int sum=0;
			for(int j=0;j<bs.length();j++)
			{
				if(bs.charAt(j)=='1')
				{
					sum+=a[j];
				}
			}
			if(sum%2!=0)
			{
				if(sum>max)
				{
					max=sum;
				}
			}
		}
		System.out.println(max);
	}
}