package com.mycompany.anno;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class NameTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		final Method method = Z.class.getMethod("something");
		if (method.isAnnotationPresent(Name.class)) {
			final Annotation annotation = method.getAnnotation(Name.class);
			final Name name = (Name) annotation;
			System.out.println(name.myName()); // Prints Kenu
		}
		Z z = new Z();
		try {
			method.invoke(z);
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		z.something();
	}
}
