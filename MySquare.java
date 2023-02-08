import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class MySquare extends Shape {

	public MySquare(double x, double y, Color myColor) {
		super(x, y, myColor);
	}

	@Override
	public void drawYourself(GraphicsContext gc) {
		gc.setFill(getMyColor());
		gc.fillRect(getX() - 10, getY() - 10, 20, 20);

	}

	@Override
	public Shape clone(double x, double y, Color c) {
		return new MySquare(x, y, c);
	}
}