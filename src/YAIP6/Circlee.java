package YAIP6;

public class Circlee implements GeometricObject {
	protected static  double radius;
	
	public Circlee ( double radius) {
		this.radius = radius; 
	}

	 public double getRadius() {
	     return radius;
	}

	 public void setRadius(double radius) {
	    this.radius = radius;
	 }

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}
}