package assignment_nov06;

public class Fourth_Class_MethodCalling {

	public static void main(String[] args) {
		
		System.out.println("Calling Methods Directly");
		
		Method31(); //Calling Methods Directly
		Method32();
		Method33();
		Method34();
		Method35();
		
		System.out.println("================");
		System.out.println("Calling Methods using Class Name");
		
		Fourth_Class_MethodCalling.Method31(); //Calling Methods using Class Name
		Fourth_Class_MethodCalling.Method32();
		Fourth_Class_MethodCalling.Method33();
		Fourth_Class_MethodCalling.Method34();
		Fourth_Class_MethodCalling.Method35();
		
		System.out.println("================");
		
		//Creating 2 different Objects of the same class.
		
		Fourth_Class_MethodCalling Object7 = new Fourth_Class_MethodCalling();
		Fourth_Class_MethodCalling Object8 = new Fourth_Class_MethodCalling();
		
		System.out.println("Calling Non-Static Methods using Object Ref 1");
		
		Object7.Method36();
		Object7.Method37();
		Object7.Method38();
		Object7.Method39();
		Object7.Method40();
		
		System.out.println("================");
		System.out.println("Calling Non-Static Methods using Object Ref 2");
		
		Object8.Method36();
		Object8.Method37();
		Object8.Method38();
		Object8.Method39();
		Object8.Method40();		
}
	
	//5 Static Methods
	
	public static void Method31() {
		System.out.println("Static Method 1");
	}
	public static void Method32() {	
		System.out.println("Static Method 2");
	}
	public static void Method33() {	
		System.out.println("Static Method 3");
	}
	public static void Method34() {	
		System.out.println("Static Method 4");
	}
	public static void Method35() {	
		System.out.println("Static Method 5");
	}
	
	//5 Non-Static Methods
	
	public void Method36() {	
		System.out.println("Non-Static Method 1");
	}
	public void Method37() {	
		System.out.println("Non-Static Method 2");
	}
	public void Method38() {	
		System.out.println("Non-Static Method 3");
	}
	public void Method39() {	
		System.out.println("Non-Static Method 4");
	}
	public void Method40() {	
		System.out.println("Non-Static Method 5");
	}

}

