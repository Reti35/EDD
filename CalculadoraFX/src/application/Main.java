package application;



import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.fxml.FXMLLoader;

public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {

		try {

			String fxml = "vista/CalculadoraIGU.fxml";

			// Cargar la ventana
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(fxml));

			// Cargar la Scene
			Scene scene = new Scene(root);

			// Asignar propiedades al Stage
			primaryStage.setTitle("Tuladora");
			primaryStage.setResizable(false);

			// Asignar la scene y mostrar
			primaryStage.setScene(scene);
			primaryStage.show();

			// Asignar icono de la aplicaci�n
			primaryStage.getIcons().add(new Image(getClass().getResource("/vista/img/icon.png").toExternalForm()));

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
