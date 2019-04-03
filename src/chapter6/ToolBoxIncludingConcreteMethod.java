package chapter6;

public class ToolBoxIncludingConcreteMethod {
	
	public static void main (String[] args) {
		
		ToolBoxIncludingConcreteMethod.isEndingWithING("string");
		boolean test1 = isEndingWithING("ping");
		System.out.println(test1);
		System.out.println(isEndingWithING(str."letting"));
		
		ToolBoxIncludingConcreteMethod t2 = new ToolBoxIncludingConcreteMethod();
		isEndingWithING2
		
	}
	
	public boolean isEndingWithING2(String str) {
		
		
	}

	public boolean isEndingWithING( String str) {
		  if (str.substring(str.length() - 3).equalsIgnoreCase("ing")) {
		    return true;
		  }
		  else return false;
		}
	}
