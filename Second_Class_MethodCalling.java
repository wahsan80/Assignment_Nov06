package assignment_nov06;

public class Second_Class_MethodCalling {

	public static void main(String[] args) {
		
		System.out.println("Calling Methods Directly");
		
		Method11(); //Calling Methods Directly
		Method12();
		Method13();
		Method14();
		Method15();
		
		System.out.println("================");
		System.out.println("Calling Methods using Class Name");
		
		Second_Class_MethodCalling.Method11(); //Calling Methods using Class Name
		Second_Class_MethodCalling.Method12();
		Second_Class_MethodCalling.Method13();
		Second_Class_MethodCalling.Method14();
		Second_Class_MethodCalling.Method15();
		
		System.out.println("================");
		
		//Creating 2 different Objects of the same class.
		
		Second_Class_MethodCalling Object3 = new Second_Class_MethodCalling();
		Second_Class_MethodCalling Object4 = new Second_Class_MethodCalling();
		
		System.out.println("Calling Non-Static Methods using Object Ref 1");
		
		Object3.Method16();
		Object3.Method17();
		Object3.Method18();
		Object3.Method19();
		Object3.Method20();
		
		System.out.println("================");
		System.out.println("Calling Non-Static Methods using Object Ref 2");
		
		Object4.Method16();
		Object4.Method17();
		Object4.Method18();
		Object4.Method19();
		Object4.Method20();		
}
	
	//5 Static Methods
	
	public static void Method11() {
		System.out.println("Static Method 11");
	}
	public static void Method12() {	
		System.out.println("Static Method 12");
	}
	public static void Method13() {	
		System.out.println("Static Method 13");
	}
	public static void Method14() {	
		System.out.println("Static Method 14");
	}
	public static void Method15() {	
		System.out.println("Static Method 15");
	}
	
	//5 Non-Static Methods
	
	public void Method16() {	
		System.out.println("Non-Static Method 11");
	}
	public void Method17() {	
		System.out.println("Non-Static Method 12");
	}
	public void Method18() {	
		System.out.println("Non-Static Method 13");
	}
	public void Method19() {	
		System.out.println("Non-Static Method 14");
	}
	public void Method20() {	
		System.out.println("Non-Static Method 15");
	}

}

