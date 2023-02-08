import java.util.ArrayList;
import javafx.scene.paint.Color;

public class Model {
	private ArrayList<Shape> contents;
	private Shape currentShape;
	private Color currentColor;

	public Model() {
		contents = new ArrayList<Shape>();
	}

	public void clear() {
		contents.clear();
	}

	public void addShape(Shape newShape) {
		contents.add(newShape);
	}

	public Color getColor() {
		return this.currentColor;
	}

	public void setColor(Color nextColor) {
		this.currentColor = nextColor;
	}

	public void setShape(Shape nextShape) {
		this.currentShape = nextShape;
	}

	public Shape getShape() {
		return this.currentShape;

	}

	public ArrayList<Shape> getContents() {
		return this.contents;
	}

}
