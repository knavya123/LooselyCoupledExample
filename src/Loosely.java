
public class Loosely {
	public static void main(String[] args) {
		Circle c = new Circle(9);
		Polygon p = new Polygon(c);
		System.out.println(p.getCalculation());

		Polygon p1 = new Polygon(new Triangle(3, 4));
		System.out.println(p1.getCalculation());
	}
}
