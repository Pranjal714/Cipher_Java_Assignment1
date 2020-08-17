public class Circle {
	private double radius=1.0;
	
	Circle(){
		
	}
	Circle(double r){
		
	}
	double get_Radius() {
		return radius;
	}
	double get_Area() {
		return (3.14*radius*radius);
	}
	
	public static void main(String[] args) {
		Circle obj = new Circle();
		System.out.println(obj.getRadius());
		System.out.println(obj.getArea());
	}
}
