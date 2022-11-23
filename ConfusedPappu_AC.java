package __Variation__;

public class ConfusedPappu_AC
{

	public static void main(String[] args)
	{
		int amount=56;
		String amt= Integer.toString(amount);
		String s="";
		for (int i = 0; i < amt.length(); i++)
		{
			if (amt.charAt(i)=='6')
			{
				s+='9';
			}
			else
			{
				s+=amt.charAt(i);
			}
		}
		
		int parseInt=Integer.parseInt(s);
		System.out.println(parseInt-amount);
	}

}
