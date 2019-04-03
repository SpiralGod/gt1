package chapter6;

public class ToolBoxTester {

	public static void main(String[] args) {
		
		//to call a non-static method
		ToolBox t1 = new ToolBox();
		boolean result = t1.isEndingWithING("Giving");
		System.out.println(result);
		
		 boolean result1 = ToolBoxStatic.isEndingWithING("king");
		 System.out.println(result1);
		 
		
	}
}
