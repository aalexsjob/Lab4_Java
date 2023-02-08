import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
//Kommentar: You have very aggressive comments :) 
public class ColorButton extends Canvas {
	private Color myColor;
	private Boolean pressed = false;

	public ColorButton(Color nextColor, Model myModel, SidePanel sidePanel) {
		this.myColor = nextColor;
		setHeight(40);
		setWidth(40);

		setOnMouseClicked(event -> {
			myModel.setColor(myColor);
			pressed = true;
			sidePanel.printColor(); // TILLKALLAR print IGEN FÖR ATT KUNNA ÄNDRA TILLBAKA OM MAN BYTER KNAPP.

		});

	}

	public void fillPanel() { // FYLLER RUTAN MED TURKOS OCH SEDAN SKAPAR EN MINDRE RUTA FYLLD MED
								// KNAPPFÄRG
		GraphicsContext box = getGraphicsContext2D();

		if (pressed) {
			box.setFill(Color.TURQUOISE);
			box.fillRect(0, -5, getWidth(), getHeight());
			box.setFill(myColor);
			box.fillRect(2, 2, 35, 30);
		} else {
			box.setFill(myColor);
			box.fillRect(0, -5, getWidth(), getHeight());
		}
		pressed = false;

	}

}
