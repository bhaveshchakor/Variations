package __Variation__;

public class confusedPappu_CBR
{
	public static void main(String[] args)
	{
		int amount=56;
		int temp=0;
		
		if (amount%10==6)
		{
			temp=(amount/10)*10+9;
			System.out.println(temp-amount);
		}
		else
		{
			System.out.println(0);
		}	
		
		
	}
}
