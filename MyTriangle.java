import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyTriangle extends Shape {
	private double[] xPoints = new double[3];
	private double[] yPoints = new double[3];

	public MyTriangle(double x, double y, Color myColor) {
		super(x, y, myColor);
	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		gc.setFill(getMyColor());
		gc.fillPolygon(getXPoints(), getYPoints(), 3);
	}

	@Override
	public Shape clone(double x, double y, Color c) {
		return new MyTriangle(x, y, c);
	}

	public double[] getXPoints() {
		xPoints[0] = getX();
		xPoints[1] = getX() - 15;
		xPoints[2] = getX() + 15;
		return xPoints;
	}

	public double[] getYPoints() {
		yPoints[0] = getY() - 10;
		yPoints[1] = getY() + 15;
		yPoints[2] = getY() + 15;
		return yPoints;
	}

}