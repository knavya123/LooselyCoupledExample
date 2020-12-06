
public class Polygon {
	
	IPolygon ipolygon;

	public Polygon(IPolygon myPolygon) {
		this.ipolygon = myPolygon;
	}

	public double getCalculation() {
		return ipolygon.getCalculation();
	}
}
