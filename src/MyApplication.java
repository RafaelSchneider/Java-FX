import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author schneider
 */
public class MyApplication extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        //Parent root = null;
        try {
          Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
          Scene scene = new Scene(root);
          primaryStage.setScene(scene);
          primaryStage.show();
        } catch (IOException ex) {
            Logger.getLogger(MyApplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
