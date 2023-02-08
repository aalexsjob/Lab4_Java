import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
	private double x;
	private double y;
	private Color myColor;

	public Shape(double x, double y, Color myColor) {
		this.x = x;
		this.y = y;
		this.myColor = myColor;
	}

	public abstract void drawYourself(GraphicsContext gc);

	public abstract Shape clone(double x, double y, Color c);

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public Color getMyColor() {
		return this.myColor;
	}

}
