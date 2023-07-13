package day04.practice;

public class RightAngledTriangle extends Polygon{
	protected double height;
	protected double base;
	
	public RightAngledTriangle(double height, double base) throws Exception {
		super(4);
		if(height <= 0 || base <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.height = height;
		this.base = base;
	}
	@Override
	public double calculateArea() {
		return (this.height * this.base)/2;
	}
	public double calculatePerimeter() {
		   return (this.height + this.base + Math.sqrt(Math.pow(this.height, 2) + Math.pow(this.base, 2)));
	}
	public int getNumberOfSides() {
		return super.numberOfSides;
	}
}