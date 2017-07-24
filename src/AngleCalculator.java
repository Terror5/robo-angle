
public class AngleCalculator {
	
	public static double M_PI = Math.PI;


	public Dockings mpsDockingStartPositions(double dockingAlpha, double mpsX, double mpsY) {
	    
	    double dockingAlphaRotate = getInverseOrientation(dockingAlpha);

	    // center of the station -> directed in same angle as robot -> shift behind the line
	    double centerX = (0.085) * Math.cos(dockingAlphaRotate) + mpsX;
	    double centerY = (0.085) * Math.sin(dockingAlphaRotate) + mpsY;

	    // Docking point between robot and station -> shift in rotated direction towards the robot
	    double dockingX1 = 1.0d * Math.cos(dockingAlpha) + mpsX;
	    double dockingY1 = 1.0d * Math.sin(dockingAlpha) + mpsY;

	    // Docking point behind station -> same direction as robot
	    double dockingX2 = 1.0d * Math.cos(dockingAlphaRotate) + mpsX;
	    double dockingY2 = 1.0d * Math.sin(dockingAlphaRotate) + mpsY;
	    
	    Dockings d = new Dockings();
	    d.setCenterX(centerX);
	    d.setCenterY(centerY);
	    d.setDockingAlpha(dockingAlpha);
	    d.setDockingAlphaRotate(dockingAlphaRotate);
	    d.setDockingX1(dockingX1);
	    d.setDockingX2(dockingX2);
	    d.setDockingY1(dockingY1);
	    d.setDockingY2(dockingY2);
	    
	    return d;

	}

	public double getInverseOrientation(double angle) {

	    if(angle < 0) {
	        angle = angle + M_PI;
	    } else {
	        angle = angle - M_PI;
	    }
	    return angle;
	}
	
	public static void main(String[] args) {
		AngleCalculator a = new AngleCalculator();
		Dockings d = a.mpsDockingStartPositions(-(3*M_PI / 4), 2, 2);
		System.out.println(d.toString());
	}
	
}
