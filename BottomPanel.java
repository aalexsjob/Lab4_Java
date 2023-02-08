import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class BottomPanel extends HBox {
	private Button clearButton;

	public BottomPanel(PaintSurface myCanvas) {
		setBackground(new Background(new BackgroundFill(Color.GRAY, null, null)));
		Button clearButton = new Button("Rensa");
		getChildren().add(clearButton);
		clearButton.setOnAction(value -> {
			myCanvas.clear();
		});

	}

}
