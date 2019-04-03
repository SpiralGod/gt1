package chapter6;

public class UtilityTester {

public static void main(String[] args) {
		
		//non-static method must be called by the object.
	    //non static method must be invoked by the object.
	
	Utility u1 = new Utility(); //u1 is object of Utility type or class.
	
	u1.getFirstTwoCharConcat("mom", "daddy");
	
	System.out.println(u1.getFirstTwoCharConcat("mom", "daddy"));
	
	//static method is called by the class name where the method is defined.
	UtilityStatic.getFirstTwoCharConcat("mom", "daddy");
	
	
	
	System.out.println(UtilityStatic.getFirstTwoCharConcat("mom", "daddy"));
		
	}
}

