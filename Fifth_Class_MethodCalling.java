package assignment_nov06;

public class Fifth_Class_MethodCalling {

	public static void main(String[] args) {
		
		System.out.println("Calling Methods Directly");
		
		Method41(); //Calling Methods Directly
		Method42();
		Method43();
		Method44();
		Method45();
		
		System.out.println("================");
		System.out.println("Calling Methods using Class Name");
		
		Fifth_Class_MethodCalling.Method41(); //Calling Methods using Class Name
		Fifth_Class_MethodCalling.Method42();
		Fifth_Class_MethodCalling.Method43();
		Fifth_Class_MethodCalling.Method44();
		Fifth_Class_MethodCalling.Method45();
		
		System.out.println("================");
		
		//Creating 2 different Objects of the same class.
		
		Fifth_Class_MethodCalling Object9 = new Fifth_Class_MethodCalling();
		Fifth_Class_MethodCalling Object10 = new Fifth_Class_MethodCalling();
		
		System.out.println("Calling Non-Static Methods using Object Ref 1");
		
		Object9.Method46();
		Object9.Method47();
		Object9.Method48();
		Object9.Method49();
		Object9.Method50();
		
		System.out.println("================");
		System.out.println("Calling Non-Static Methods using Object Ref 2");
		
		Object10.Method46();
		Object10.Method47();
		Object10.Method48();
		Object10.Method49();
		Object10.Method50();		
}
	
	//5 Static Methods
	
	public static void Method41() {
		System.out.println("Static Method 1");
	}
	public static void Method42() {	
		System.out.println("Static Method 2");
	}
	public static void Method43() {	
		System.out.println("Static Method 3");
	}
	public static void Method44() {	
		System.out.println("Static Method 4");
	}
	public static void Method45() {	
		System.out.println("Static Method 5");
	}
	
	//5 Non-Static Methods
	
	public void Method46() {	
		System.out.println("Non-Static Method 1");
	}
	public void Method47() {	
		System.out.println("Non-Static Method 2");
	}
	public void Method48() {	
		System.out.println("Non-Static Method 3");
	}
	public void Method49() {	
		System.out.println("Non-Static Method 4");
	}
	public void Method50() {	
		System.out.println("Non-Static Method 5");
	}

}

