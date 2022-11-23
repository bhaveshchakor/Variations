package __Variation__;

public class SwapString 
{
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String str1 = "Good ", str2 = "morning ";  
		myCode(str1,str2);
	}
	//EndOfMainMethod
	private static void myCode(String str1,String str2)
	{
		System.out.println("Strings before swapping: "+str1+" "+str2);
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length(), str1.length());
		System.out.println("Strings after swapping: "+str1+" "+str2);
	}
}