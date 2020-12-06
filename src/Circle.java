
public class Circle implements IPolygon{
	private double r;
	public Circle(double r){
		this.r=r;
	}

	@Override
	public double getCalculation(){
		return (22/7)*r*r;
	}

	
}
