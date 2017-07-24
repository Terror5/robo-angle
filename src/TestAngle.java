import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class TestAngle {
	
	private AngleCalculator calc;
	private static double M_PI;
	
	@BeforeClass
	public static void setUpClass() {
		 M_PI = AngleCalculator.M_PI;
	}
	
	@Before
	public void setUp(){
		calc = new AngleCalculator();
	}
	

	@Test
	public void xPositiveYPositive() {
		double angle = -(3*M_PI / 4);
		Dockings d = calc.mpsDockingStartPositions(angle, 2, 2);
		assertEquals(1.3, d.getDockingX1(), 0.01);
		assertEquals(1.3, d.getDockingY1(), 0.01);
		assertEquals(2.7, d.getDockingX2(), 0.01);
		assertEquals(2.7, d.getDockingY2(), 0.01);
		assertEquals(2.06, d.getCenterX(), 0.01);
		assertEquals(2.06, d.getCenterY(), 0.01);
	}
	
	@Test
	public void xNegativeYPositive() {
		double angle = -(M_PI / 4);
		Dockings d = calc.mpsDockingStartPositions(angle, -2, 2);
		assertEquals(-1.3, d.getDockingX1(), 0.01);
		assertEquals(1.3, d.getDockingY1(), 0.01);
		assertEquals(-2.7, d.getDockingX2(), 0.01);
		assertEquals(2.7, d.getDockingY2(), 0.01);
		assertEquals(-2.06, d.getCenterX(), 0.01);
		assertEquals(2.06, d.getCenterY(), 0.01);
	}

	@Test
	public void xNegativeYNegative() {
		double angle = (M_PI / 4);
		Dockings d = calc.mpsDockingStartPositions(angle, -2, -2);
		assertEquals(-1.3, d.getDockingX1(), 0.01);
		assertEquals(-1.3, d.getDockingY1(), 0.01);
		assertEquals(-2.7, d.getDockingX2(), 0.01);
		assertEquals(-2.7, d.getDockingY2(), 0.01);
		assertEquals(-2.06, d.getCenterX(), 0.01);
		assertEquals(-2.06, d.getCenterY(), 0.01);
	}

	@Test
	public void xPositiveYNegative() {
		double angle = (3*M_PI / 4);
		Dockings d = calc.mpsDockingStartPositions(angle, 2, -2);
		assertEquals(1.3, d.getDockingX1(), 0.1);
		assertEquals(-1.3, d.getDockingY1(), 0.1);
		assertEquals(2.7, d.getDockingX2(), 0.1);
		assertEquals(-2.7, d.getDockingY2(), 0.1);
		assertEquals(2.06, d.getCenterX(), 0.01);
		assertEquals(-2.06, d.getCenterY(), 0.01);
	}
	
	//################################ INVERSE CASES -> ROBOT STANDING "ABOVE"
	
	@Test
	public void xPositiveYPositiveInv() {
		double angle = calc.getInverseOrientation(-(3*M_PI / 4));
		Dockings d = calc.mpsDockingStartPositions(angle, 2, 2);
		assertEquals(1.3, d.getDockingX2(), 0.01);
		assertEquals(1.3, d.getDockingY2(), 0.01);
		assertEquals(2.7, d.getDockingX1(), 0.01);
		assertEquals(2.7, d.getDockingY1(), 0.01);
		assertEquals(1.93, d.getCenterX(), 0.01);
		assertEquals(1.93, d.getCenterY(), 0.01);
	}
	
	@Test
	public void xNegativeYPositiveInv() {
		double angle = calc.getInverseOrientation(-(M_PI / 4));
		Dockings d = calc.mpsDockingStartPositions(angle, -2, 2);
		assertEquals(-1.3, d.getDockingX2(), 0.01);
		assertEquals(1.3, d.getDockingY2(), 0.01);
		assertEquals(-2.7, d.getDockingX1(), 0.01);
		assertEquals(2.7, d.getDockingY1(), 0.01);
		assertEquals(-1.93, d.getCenterX(), 0.01);
		assertEquals(1.93, d.getCenterY(), 0.01);
	}

	@Test
	public void xNegativeYNegativeInv() {
		double angle = calc.getInverseOrientation((M_PI / 4));
		Dockings d = calc.mpsDockingStartPositions(angle, -2, -2);
		assertEquals(-1.3, d.getDockingX2(), 0.01);
		assertEquals(-1.3, d.getDockingY2(), 0.01);
		assertEquals(-2.7, d.getDockingX1(), 0.01);
		assertEquals(-2.7, d.getDockingY1(), 0.01);
		assertEquals(-1.93, d.getCenterX(), 0.01);
		assertEquals(-1.93, d.getCenterY(), 0.01);
	}

	@Test
	public void xPositiveYNegativeInv() {
		double angle = calc.getInverseOrientation((3*M_PI / 4));
		Dockings d = calc.mpsDockingStartPositions(angle, 2, -2);
		assertEquals(1.3, d.getDockingX2(), 0.1);
		assertEquals(-1.3, d.getDockingY2(), 0.1);
		assertEquals(2.7, d.getDockingX1(), 0.1);
		assertEquals(-2.7, d.getDockingY1(), 0.1);
		assertEquals(1.93, d.getCenterX(), 0.01);
		assertEquals(-1.93, d.getCenterY(), 0.01);
	}


}
