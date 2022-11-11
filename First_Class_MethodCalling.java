package assignment_nov06;

public class First_Class_MethodCalling {

	public static void main(String[] args) {
		
		System.out.println("Calling Methods Directly");
		
		Method1(); //Calling Methods Directly
		Method2();
		Method3();
		Method4();
		Method5();
		
		System.out.println("================");
		System.out.println("Calling Methods using Class Name");
		
		First_Class_MethodCalling.Method1(); //Calling Methods using Class Name
		First_Class_MethodCalling.Method2();
		First_Class_MethodCalling.Method3();
		First_Class_MethodCalling.Method4();
		First_Class_MethodCalling.Method5();
		
		System.out.println("================");
		
		//Creating 2 different Objects of the same class.
		
		First_Class_MethodCalling Object1 = new First_Class_MethodCalling();
		First_Class_MethodCalling Object2 = new First_Class_MethodCalling();
		
		System.out.println("Calling Non-Static Methods using Object Ref 1");
		
		Object1.Method6();
		Object1.Method7();
		Object1.Method8();
		Object1.Method9();
		Object1.Method10();
		
		System.out.println("================");
		System.out.println("Calling Non-Static Methods using Object Ref 2");
		
		Object2.Method6();
		Object2.Method7();
		Object2.Method8();
		Object2.Method9();
		Object2.Method10();		
}
	
	//5 Static Methods
	
	public static void Method1() {
		System.out.println("Static Method 1");
	}
	public static void Method2() {	
		System.out.println("Static Method 2");
	}
	public static void Method3() {	
		System.out.println("Static Method 3");
	}
	public static void Method4() {	
		System.out.println("Static Method 4");
	}
	public static void Method5() {	
		System.out.println("Static Method 5");
	}
	
	//5 Non-Static Methods
	
	public void Method6() {	
		System.out.println("Non-Static Method 1");
	}
	public void Method7() {	
		System.out.println("Non-Static Method 2");
	}
	public void Method8() {	
		System.out.println("Non-Static Method 3");
	}
	public void Method9() {	
		System.out.println("Non-Static Method 4");
	}
	public void Method10() {	
		System.out.println("Non-Static Method 5");
	}

}
