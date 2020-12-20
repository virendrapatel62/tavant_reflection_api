package reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;

import com.tavant.reflection.ConcreteClass;

public class MainSuper {

	public static void main(String[] args) {
		Class concrete =ConcreteClass.class;
		Class base = concrete.getSuperclass();
		Class objectClass = base.getSuperclass();
		Package packageName = concrete.getPackage();
		Annotation annotation[] = objectClass.getAnnotations();
		
		System.out.println(concrete);
		System.out.println(base);
		System.out.println(objectClass);
		System.out.println(packageName);
		
		System.out.println(Modifier.toString(concrete.getModifiers()));
		
		Arrays.asList(HashMap.class.getGenericInterfaces()).forEach(System.out::println);
		
		System.out.println("--------- Only declared in class ------");
		Arrays.asList(concrete.getDeclaredMethods()).forEach(System.out::println);
		
		System.out.println("---------ALl Method ------");
		Arrays.asList(concrete.getMethods()).forEach(System.out::println);
		
		System.out.println("--------Fields------");
		Arrays.asList(concrete.getFields()).forEach(System.out::println);
		
		System.out.println("--------Decl..------");
		Arrays.asList(concrete.getDeclaredFields()).forEach(System.out::println);
	}

}
