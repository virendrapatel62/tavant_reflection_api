package reflection;

import java.lang.reflect.Field;

import com.tavant.reflection.ConcreteClass;

public class ReadFields {
	
	public static void main(String[] args) throws Exception {
		Field field = Class.forName(ConcreteClass.class.getName()).getField("publicInt");
		Class fieldType = field.getType();
		
		System.out.println(field.getName());
		System.out.println(fieldType.getCanonicalName());
		ConcreteClass obj = new ConcreteClass(3);
		field.setInt(obj, 100);
		System.out.println(field.getInt(obj));
		
		
//		private 
		Field field2 = Class.forName(ConcreteClass.class.getName()).getDeclaredField("privateString");
		ConcreteClass obj2 = new ConcreteClass(3);
		System.out.println(field2.get(obj2));
	}

}
