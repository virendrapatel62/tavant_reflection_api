package reflection;

import com.tavant.reflection.ConcreteClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<?> class1 = ConcreteClass.class;
		
		System.out.println(class1);
		System.out.println(class1.getSimpleName());
		System.out.println(class1.getTypeName());
		
		System.out.println("\n\nAll Inner CLasses---- ");
		for (Class string : class1.getClasses()) {
			System.out.println(string);
		}
		
		
		
	}

}
