
package com.myPackage;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class GuiController
{
	@FXML private Text resultField;

	@FXML public void btn0Pressed(ActionEvent event) { System.out.println("Button 0 was pressed"); }
	@FXML public void btn1Pressed(ActionEvent event) { System.out.println("Button 1 was pressed"); }
	@FXML public void btn2Pressed(ActionEvent event) { System.out.println("Button 2 was pressed"); }
	@FXML public void btn3Pressed(ActionEvent event) { System.out.println("Button 3 was pressed"); }
	@FXML public void btn4Pressed(ActionEvent event) { System.out.println("Button 4 was pressed"); }
	@FXML public void btn5Pressed(ActionEvent event) { System.out.println("Button 5 was pressed"); }
	@FXML public void btn6Pressed(ActionEvent event) { System.out.println("Button 6 was pressed"); }
	@FXML public void btn7Pressed(ActionEvent event) { System.out.println("Button 7 was pressed"); }
	@FXML public void btn8Pressed(ActionEvent event) { System.out.println("Button 8 was pressed"); }
	@FXML public void btn9Pressed(ActionEvent event) { System.out.println("Button 9 was pressed"); }

	@FXML public void btnSumPressed(ActionEvent event) { System.out.println("Button sum was pressed"); }
	@FXML public void btnSubPressed(ActionEvent event) { System.out.println("Button sub was pressed"); }
	@FXML public void btnMulPressed(ActionEvent event) { System.out.println("Button mul was pressed"); }
	@FXML public void btnDivPressed(ActionEvent event) { System.out.println("Button div was pressed"); }
	@FXML public void btnEqualPressed(ActionEvent event) { System.out.println("Button equal was pressed"); }

	@FXML public void SetResult()
	{
	
	}
}
