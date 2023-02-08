import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class ShapeButton extends Canvas {
	private Shape myShape;
	private Boolean pressed = false;

	public ShapeButton(Shape myShape, Model myModel, SidePanel sidePanel) {
		this.myShape = myShape;
		setHeight(40);
		setWidth(40);

		setOnMouseClicked(event -> {
			myModel.setShape(myShape);
			pressed = true;
			sidePanel.printShapes();
		});

	}

	public void fillPanel() {
		GraphicsContext box = getGraphicsContext2D();
		if (pressed) {
			box.setFill(Color.TURQUOISE);
			box.fillRect(0, -5, getWidth(), getHeight());
			box.setFill(Color.GREY);
			box.fillRect(2, 2, 35, 30);
			myShape.drawYourself(box);
		} else {
			box.setFill(Color.GREY);
			box.fillRect(0, -5, getWidth(), getHeight());
			myShape.drawYourself(box);
		}
		pressed = false;
	}

}
