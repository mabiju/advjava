import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Vijaya Malla
 */
public class App extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("GridPane Demo");
        Label username = new Label("Username");
        Label password = new Label("Password");
        TextField tfuname = new TextField();
        PasswordField pfpass = new PasswordField();
        Button Submit = new Button("Submit");
        GridPane gp = new GridPane();
        Scene sc = new Scene(gp,800,400);
        gp.addRow(0, username,tfuname);
        gp.addRow(1, password,pfpass);
        gp.addRow(2, Submit);
        primaryStage.setScene(sc);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}