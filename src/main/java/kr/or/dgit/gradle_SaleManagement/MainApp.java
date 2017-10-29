package kr.or.dgit.gradle_SaleManagement;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import kr.or.dgit.gradle_SaleManagement.view.RootLayoutController;

public class MainApp extends Application {
	private Stage primaryStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("영업 관리 프로그램");
		
		RootLayoutController controller = new RootLayoutController();
		controller.setMainApp(this);
		
		initRootLayout();

		showSalesManager();
		
		showProductManager();

	}

	public void showProductManager() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/ProductManagementView.fxml"));
			BorderPane pane = (BorderPane) loader.load();

			rootLayout.setCenter(pane);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	private void showSalesManager() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/SalesManagementView.fxml"));
			BorderPane pane = (BorderPane) loader.load();
			
			rootLayout.setCenter(pane);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();

			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
