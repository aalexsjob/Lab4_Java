import java.util.ArrayList;

import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class SidePanel extends VBox {
	private ArrayList<ColorButton> cButtons = new ArrayList<ColorButton>();
	private ArrayList<ShapeButton> sButtons = new ArrayList<ShapeButton>();

	public SidePanel(Model myModel) {
		setBackground(new Background(new BackgroundFill(Color.GREY, null, null)));

		// Färgknappar
		Label colorLabel = new Label("Färg");
		ColorButton myBlackButton = new ColorButton(Color.BLACK, myModel, this);
		ColorButton myRedButton = new ColorButton(Color.RED, myModel, this);
		ColorButton myBlueButton = new ColorButton(Color.BLUE, myModel, this);
		ColorButton myGreenButton = new ColorButton(Color.GREEN, myModel, this);
		ColorButton myYellowButton = new ColorButton(Color.YELLOW, myModel, this);
		ColorButton myPinkButton = new ColorButton(Color.DEEPPINK, myModel, this);
		ColorButton myWhiteButton = new ColorButton(Color.WHITE, myModel, this);
		ColorButton myOrangeButton = new ColorButton(Color.ORANGE, myModel, this);

		cButtons.add(myBlackButton);
		cButtons.add(myRedButton);
		cButtons.add(myBlueButton);
		cButtons.add(myGreenButton);
		cButtons.add(myYellowButton);
		cButtons.add(myPinkButton);
		cButtons.add(myWhiteButton);
		cButtons.add(myOrangeButton);

		getChildren().add(colorLabel);

		for (ColorButton colors : cButtons) {
			getChildren().add(colors);
		}
		for (ColorButton colors : cButtons) {
			colors.fillPanel();
		}

		// Formknappar
		Label shapeLabel = new Label("Form");
		MyCircle circleLabel = new MyCircle(20, 17, Color.BLACK);
		MyTriangle triangleLabel = new MyTriangle(20, 15, Color.BLACK);
		MySquare squareLabel = new MySquare(20, 17, Color.BLACK);

		ShapeButton myCircleButton = new ShapeButton(circleLabel, myModel, this);
		ShapeButton myTraingleButton = new ShapeButton(triangleLabel, myModel, this);
		ShapeButton mySquareButton = new ShapeButton(squareLabel, myModel, this);

		// Lägger till objekt i listan för former
		sButtons.add(myCircleButton);
		sButtons.add(myTraingleButton);
		sButtons.add(mySquareButton);

		getChildren().add(shapeLabel);

		for (ShapeButton shapes : sButtons) {
			getChildren().add(shapes);
		}

		for (ShapeButton shapes : sButtons) {
			shapes.fillPanel();
		}
	}

	// METODER
	public void printColor() {

		for (ColorButton colors : cButtons) {
			colors.fillPanel();
		}
	}

	public void printShapes() {
		for (ShapeButton shapes : sButtons) {
			shapes.fillPanel();
		}
	}
}
