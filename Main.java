import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		primaryStage.setTitle("Välkommen till Ritprogrammet!");
		primaryStage.setWidth(600);
		primaryStage.setHeight(536);

		HBox internalLayout = new HBox();
		Model myModel = new Model();

		PaintSurface myCanvas = new PaintSurface(556, 480);
		myCanvas.setModel(myModel);
		BottomPanel myBottomPanel = new BottomPanel(myCanvas);
		SidePanel mySidePanel = new SidePanel(myCanvas.getModel());

		internalLayout.getChildren().add(myCanvas);
		internalLayout.getChildren().add(mySidePanel);

		VBox mainLayout = new VBox();
		mainLayout.getChildren().add(internalLayout);
		mainLayout.getChildren().add(myBottomPanel);

		Scene mainScene = new Scene(mainLayout);
		primaryStage.setScene(mainScene);
		primaryStage.show();
	}
}