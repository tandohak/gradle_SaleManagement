package kr.or.dgit.gradle_SaleManagement.view;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
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
	public void setRootLayout() {
		
	}
	
	@FXML
	private void handleShowProductManager() {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("ProductManagementView.fxml"));
			BorderPane pane = loader.load();
			rootPane.setCenter(pane);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@FXML
	private void hadleShowSalesManager() {
		
	}

}
