package entities;

public class Rectangle {
	//atributos da classe retangulo
	public double width;
	public double height;
	
	public double area() {
		double area = width * height;
		return area;
	}
	
	public double perimeter() {
		double perimeter = (2 * width) + (2 * height);
		return perimeter;
	}
	
	public double diagonal () {
		double diagonal = Math.sqrt(height * height + width * width);
		return diagonal;
	}
}
