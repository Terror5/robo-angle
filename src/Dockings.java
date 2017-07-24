
public class Dockings {
	
	private double dockingAlpha;
	private double dockingAlphaRotate;

	private double centerX;
	private double centerY;

	private double dockingX1;
	private double dockingY1;

	private double dockingX2;
	private double dockingY2;
	
	@Override
	public String toString() {
		return "Dockings [dockingAlpha=" + dockingAlpha
				+ ", dockingAlphaRotate=" + dockingAlphaRotate + ", centerX="
				+ centerX + ", centerY=" + centerY + ", dockingX1=" + dockingX1
				+ ", dockingY1=" + dockingY1 + ", dockingX2=" + dockingX2
				+ ", dockingY2=" + dockingY2 + "]";
	}
	
	public double getDockingAlpha() {
		return dockingAlpha;
	}
	public void setDockingAlpha(double dockingAlpha) {
		this.dockingAlpha = dockingAlpha;
	}
	public double getDockingAlphaRotate() {
		return dockingAlphaRotate;
	}
	public void setDockingAlphaRotate(double dockingAlphaRotate) {
		this.dockingAlphaRotate = dockingAlphaRotate;
	}
	public double getCenterX() {
		return centerX;
	}
	public void setCenterX(double centerX) {
		this.centerX = centerX;
	}
	public double getCenterY() {
		return centerY;
	}
	public void setCenterY(double centerY) {
		this.centerY = centerY;
	}
	public double getDockingX1() {
		return dockingX1;
	}
	public void setDockingX1(double dockingX1) {
		this.dockingX1 = dockingX1;
	}
	public double getDockingY1() {
		return dockingY1;
	}
	public void setDockingY1(double dockingY1) {
		this.dockingY1 = dockingY1;
	}
	public double getDockingX2() {
		return dockingX2;
	}
	public void setDockingX2(double dockingX2) {
		this.dockingX2 = dockingX2;
	}
	public double getDockingY2() {
		return dockingY2;
	}
	public void setDockingY2(double dockingY2) {
		this.dockingY2 = dockingY2;
	}

}
