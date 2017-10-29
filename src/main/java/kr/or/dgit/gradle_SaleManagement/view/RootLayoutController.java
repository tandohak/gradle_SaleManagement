package kr.or.dgit.gradle_SaleManagement.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import kr.or.dgit.gradle_SaleManagement.MainApp;

public class RootLayoutController {
	@FXML
	private BorderPane rootPane;

	private MainApp mainApp;

	@FXML
	private void initialize() {

	}

	public void setMainApp(MainApp mainApp) {
		this.mainApp = mainApp;
	}

	@FXML
	private void handleShowProductManager() {
		try {
			BorderPane pane = (BorderPane)FXMLLoader.load(getClass().getResource("view/ProductManagementView.fxml"));
			
			mainApp.getRootLayout().setCenter(pane);			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
