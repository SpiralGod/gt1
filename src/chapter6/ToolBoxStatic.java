package chapter6;

public class ToolBoxStatic {

	
	public static boolean isEndingWithING(String str)
	{
		if(str.substring(str.length()-3).equalsIgnoreCase("ing"))
		{
			return true;
		}
		else return false; 
	}
	
}
