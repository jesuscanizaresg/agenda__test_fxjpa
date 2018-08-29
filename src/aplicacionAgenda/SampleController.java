package aplicacionAgenda;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class SampleController {

	@FXML
	TextArea textField;
	
	@FXML
	TextArea textAreaDown;
	
	@FXML
	void insertarActor() {
		System.out.println("Hola");
	}
	
	@FXML
	void saludar() {
		String textoIntroducido = textField.getText();
		textAreaDown.setText("Se ha introducido: "+textoIntroducido);
		textField.setText("");
		//System.out.println("Saludando y esto es lo que has intro: "+textoIntroducido);
		
	}

}
