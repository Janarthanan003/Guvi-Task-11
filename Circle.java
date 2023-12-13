package oopsconcept;

public class Circle {
	private double radius;
		  public Circle() {
		    this.radius = 0.0;
		  }
		  public Circle(double radius) {
		    this.radius = radius;
		  }
		  public double calculateCircumference() {
		    return 2 * Math.PI * radius;
		  }
		  public static void main(String[] args) {
		    Circle circle1 = new Circle();
		    Circle circle2 = new Circle(5.0);
		    System.out.println("Circumference of circle1: " + circle1.calculateCircumference());
		    System.out.println("Circumference of circle2: " + circle2.calculateCircumference());
		  }
}

