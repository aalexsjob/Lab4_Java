import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MyCircle extends Shape {

	public MyCircle(double x, double y, Color myColor) {
		super(x, y, myColor);
	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		gc.setFill(getMyColor());
		gc.fillOval(getX() - 10, getY() - 10, 20, 20);

	}

	@Override
	public Shape clone(double x, double y, Color c) {
		return new MyCircle(x, y, c);
	}

}
