package YAIP6;

public class Rectangle implements GeometricObject{
	private double width;
	private double lenght;
	
	  
    public Rectangle(double widht, double lenght) {
        this.lenght = lenght;
        this.width = width ;
    }
    

    @Override
    public String toString() {
    	return "Rectangle [width =" + width + ", lenght=" + lenght + "[";
    }
    
    @Override
    public double getArea() {
 
        return lenght * width;
    }

    @Override
    public double getPerimeter() {
     return (lenght + width) * 2;
    }
}
