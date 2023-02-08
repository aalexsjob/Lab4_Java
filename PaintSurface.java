import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class PaintSurface extends Canvas {
	private Model myModel;

	public PaintSurface(int width, int height) {
		setWidth(width);
		setHeight(height);

		GraphicsContext gc = getGraphicsContext2D();

		gc.setFill(Color.WHITE);
		gc.fillRect(0, 0, getWidth(), getHeight());

		setOnMouseClicked(event -> {

			Shape temp = myModel.getShape();

			myModel.addShape(temp.clone(event.getX(), event.getY(), myModel.getColor()));

			for (Shape s : myModel.getContents()) {
				s.drawYourself(getGraphicsContext2D());
			}

		});

	}

	public void clear() {
		myModel.clear();
		getGraphicsContext2D().clearRect(0, 0, getWidth(), getHeight());
		GraphicsContext brush = getGraphicsContext2D();
		brush.setFill(Color.WHITE);
		brush.fillRect(0, 0, getWidth(), getHeight());
	}

	public void setModel(Model myModel) {
		this.myModel = myModel;
	}

	public Model getModel() {
		return this.myModel;
	}

}
