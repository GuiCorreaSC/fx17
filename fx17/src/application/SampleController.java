package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SampleController {
	
	@FXML public TextField txtPeso;
	@FXML public TextField txtAltura;
	@FXML public Label lblImc;
	
	@FXML public void calculaImc() {
		double peso = Double.parseDouble(txtPeso.getText());
		double altura = Double.parseDouble(txtAltura.getText());
		double imc = peso / (altura * altura);
		lblImc.setText(imc+"");
	}
	 
}
