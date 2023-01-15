
package com.myPackage.calculator;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;
import javafx.fxml.*;

public class Main extends Application
{
	public static void main(String argv[])
	{
		launch(argv);
	}

	// Called when application starts
	@Override
	public void start(Stage mainStage) throws Exception
	{
		Parent root = FXMLLoader.load(getClass().getResource("calculatorStyle.fxml"));
		Scene mainScene = new Scene(root, 300, 400);

		mainStage.setTitle("Calculator");
		mainStage.setResizable(false);
		mainStage.setScene(mainScene);
		mainStage.show();
	}
}
