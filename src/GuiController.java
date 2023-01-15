
package com.myPackage.calculator;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;

public class GuiController
{
	private String input = null;
	private Value result = null;				// Result of the last operation
	private boolean canInsertOp = false;			// Indicates if an operation can be inserted (becomes true only after a number has been inserted)
	@FXML private Text resultField;

	public GuiController()
	{
		this.input = new String("");
		this.result = new Value("");
	}

	private void update(char digit)
	{
		this.input += digit;
		displayText(this.input);
	}

	@FXML public void btn0Pressed(ActionEvent event) { update('0'); this.canInsertOp = true; }
	@FXML public void btn1Pressed(ActionEvent event) { update('1'); this.canInsertOp = true; }
	@FXML public void btn2Pressed(ActionEvent event) { update('2'); this.canInsertOp = true; }
	@FXML public void btn3Pressed(ActionEvent event) { update('3'); this.canInsertOp = true; }
	@FXML public void btn4Pressed(ActionEvent event) { update('4'); this.canInsertOp = true; }
	@FXML public void btn5Pressed(ActionEvent event) { update('5'); this.canInsertOp = true; }
	@FXML public void btn6Pressed(ActionEvent event) { update('6'); this.canInsertOp = true; }
	@FXML public void btn7Pressed(ActionEvent event) { update('7'); this.canInsertOp = true; }
	@FXML public void btn8Pressed(ActionEvent event) { update('8'); this.canInsertOp = true; }
	@FXML public void btn9Pressed(ActionEvent event) { update('9'); this.canInsertOp = true; }

	@FXML public void btnSumPressed(ActionEvent event)
	{
		if(this.canInsertOp == true)
		{
			update('+');
			this.canInsertOp = false;
		}
	}

	@FXML public void btnSubPressed(ActionEvent event)
	{
		if(this.canInsertOp == true)
		{
			update('-');
			this.canInsertOp = false;
		}
	}

	@FXML public void btnMulPressed(ActionEvent event)
	{
		if(this.canInsertOp == true)
		{
			update('*');
			this.canInsertOp = false;
		}
	}

	@FXML public void btnDivPressed(ActionEvent event)
	{
		if(this.canInsertOp == true)
		{
			update('/');
			this.canInsertOp = false;
		}
	}

	// Method called when user clicks on equal button
	@FXML public void btnEqualPressed(ActionEvent event)
	{
		// TODO: Parse input string, create Values and operators and execute operations
/*		LogicController lc = new LogicController();
		int inputSize = input.size();

		for(int i = 0; i < inputSize; i++)
		{
			switch(this.input.at(i))
			{
				case '+':
					break;

				case '-':
					break;

				case '*':
					break;

				case '/':
					break;

				default:
					break;
			}
		}*/
		System.out.println("Input is:" + this.input);

		this.canInsertOp = false;
	}

	// Prints the result string
	@FXML public void displayText(String text)
	{
		resultField.setText(text);
	}
}
