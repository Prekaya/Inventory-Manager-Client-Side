package reprographicsinventorymanager;

import java.net.URL;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.beans.property.Property;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import reprographicsinventorymanager.ScreenControllers.LoginScreenController;

/**
 *
 * @author ADDO_a
 */
public class ReprographicsInventoryManager extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane root = FXMLLoader.load(getClass().getResource("Screens/LoginScreen.fxml"));

        Scene scene = new Scene(root, 355, 500);

        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();

        /* Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        
        StackPane root = new StackPane();
        root.getChildren().add(btn);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show(); */

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
