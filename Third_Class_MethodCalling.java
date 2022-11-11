package assignment_nov06;

public class Third_Class_MethodCalling {

	public static void main(String[] args) {
		
		System.out.println("Calling Methods Directly");
		
		Method21(); //Calling Methods Directly
		Method22();
		Method23();
		Method24();
		Method25();
		
		System.out.println("================");
		System.out.println("Calling Methods using Class Name");
		
		Third_Class_MethodCalling.Method21(); //Calling Methods using Class Name
		Third_Class_MethodCalling.Method22();
		Third_Class_MethodCalling.Method23();
		Third_Class_MethodCalling.Method24();
		Third_Class_MethodCalling.Method25();
		
		System.out.println("================");
		
		//Creating 2 different Objects of the same class.
		
		Third_Class_MethodCalling Object5 = new Third_Class_MethodCalling();
		Third_Class_MethodCalling Object6 = new Third_Class_MethodCalling();
		
		System.out.println("Calling Non-Static Methods using Object Ref 1");
		
		Object5.Method26();
		Object5.Method27();
		Object5.Method28();
		Object5.Method29();
		Object5.Method30();
		
		System.out.println("================");
		System.out.println("Calling Non-Static Methods using Object Ref 2");
		
		Object6.Method26();
		Object6.Method27();
		Object6.Method28();
		Object6.Method29();
		Object6.Method30();		
}
	
	//5 Static Methods
	
	public static void Method21() {
		System.out.println("Static Method 1");
	}
	public static void Method22() {	
		System.out.println("Static Method 2");
	}
	public static void Method23() {	
		System.out.println("Static Method 3");
	}
	public static void Method24() {	
		System.out.println("Static Method 4");
	}
	public static void Method25() {	
		System.out.println("Static Method 5");
	}
	
	//5 Non-Static Methods
	
	public void Method26() {	
		System.out.println("Non-Static Method 1");
	}
	public void Method27() {	
		System.out.println("Non-Static Method 2");
	}
	public void Method28() {	
		System.out.println("Non-Static Method 3");
	}
	public void Method29() {	
		System.out.println("Non-Static Method 4");
	}
	public void Method30() {	
		System.out.println("Non-Static Method 5");
	}

}

