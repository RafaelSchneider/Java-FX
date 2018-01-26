import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class FXMLController implements Initializable {

    @FXML
    private TextField txtPesquisa;
    
    @FXML
    private Button btPesquisar;
    
    @FXML
    public void pesquisar(ActionEvent pesquisarClick){
        txtPesquisa.setText("Você acaba de pesquisar um item");
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
