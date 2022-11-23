package __Variation__;


public class DoctorClinic
{

	public static void main(String[] args)
	{
		int n=5;
		int x=9;
		
		int[]a=new int[n];
	
		int time=0;
		for (int i = 0; i < a.length; i++)
		{
			
			a[i]=time;
			time+=x;
		}
		int totalTime=0;
		for (int i = 0; i < a.length-1; i++)
		{
			totalTime+=10-Math.abs(a[i]-a[i+1]);
		}
		System.out.println(totalTime);
	}

}
