package restaurantmenu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RestaurantApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlloader = new FXMLLoader(RestaurantApplication.class.getResource("restaurant-view.fxml"));
        Scene scene = new Scene(fxmlloader.load(), 600, 400);
        primaryStage.setTitle("Restaurant Menu");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
