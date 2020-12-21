package reflection;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

import com.tavant.reflection.Employee;

public class InvokeSetterGetter {

	public static void main(String[] args) throws Exception {
		Employee employee = new Employee("ID", "First Name", "Last NAme", "909090090", 133f);
		System.out.println(employee);
		System.out.println(employee.getEmployeeFirstName());

		Arrays.asList(Employee.class.getDeclaredFields()).forEach(e -> {
			invokeGetter(employee, e.getName());

		});

	}

	public static void invokeGetter(Object object, String propertyName) {

		PropertyDescriptor propertyDescriptor;
		Method method;

		try {
			propertyDescriptor = new PropertyDescriptor(propertyName, object.getClass());
			method = propertyDescriptor.getReadMethod();
			Object result = method.invoke(object);
			System.out.println(result);
		} catch (IntrospectionException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			e.printStackTrace();
		}

	}
}
