package util;

public class Calculator {
	public static final double PI = 3.14159;
	
	public static double circumference(double radius) { //o metodo pode ser calculado independente de objeto
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}
}
