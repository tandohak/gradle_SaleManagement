package kr.or.dgit.gradle_SaleManagement.view;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import kr.or.dgit.gradle_SaleManagement.MainApp;

public class RootLayoutController {
	@FXML
	private JFXButton salesBtn;
	@FXML
	private JFXButton productBtn;
	@FXML
	private JFXButton AccountBtn;
	
	private MainApp mainApp;
	
	@FXML
    private void initialize() {
		
    }
	
	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}
	
	@FXML
	private void handleShowProductManager() {
		
	}
	
	
}
