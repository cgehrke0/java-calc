package calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

public class CalculatorActionListener implements ActionListener{
	String value1, value2;
	String operator;
	int ivalue1, ivalue2;

	private JTextField textField;

	public CalculatorActionListener(JTextField textField) {
		this.textField = textField;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent: " + e.getActionCommand());
		 switch (e.getActionCommand()) {
		 case "0": case "1": case "2": case "3": case "4": case "5": case "6":case "7": case "8": case "9":
			 textField.setText(textField.getText() + e.getActionCommand());
			 break;
		 case "C":
			 textField.setText("");
			 break;
		 case "+":
			 ivalue1 = Integer.parseInt(textField.getText());
			 textField.setText("");
			 operator = "+";
			 break;
		 case "-":
			 ivalue1 = Integer.parseInt(textField.getText());
			 textField.setText("");
			 operator = "-";
			 break;
		 case "x":
			 ivalue1 = Integer.parseInt(textField.getText());
			 textField.setText("");
			 operator = "x";
			 break;
		 case "/":
			 ivalue1 = Integer.parseInt(textField.getText());
			 textField.setText("");
			 operator = "/";
			 break;
		 case "%":
			 ivalue1 = Integer.parseInt(textField.getText());
			 textField.setText("");
			 operator = "%";
			 break;
		 case "U":
			 ivalue1 = Integer.parseInt(textField.getText());
			 if (ivalue1 > 0) {
			 textField.setText("-"+ textField.getText());
			 } else if (ivalue1 < 0) {
				 ivalue1 = ivalue1 * -1;
				 value1 = Integer.toString(ivalue1);
				 textField.setText(value1);
			 }
			 else if (ivalue1 == 0) {
				 break;
			 }
			 break;
		 case "=":
			 int ivalue2 = Integer.parseInt(textField.getText());
			 switch (operator) {
			 case "+":
				 int sum = ivalue1 + ivalue2;
				 value1 = Integer.toString(sum);
				 textField.setText(value1);
				 break;
			 case "-":
				 int difference = ivalue1 - ivalue2;
				 value1 = Integer.toString(difference);
				 textField.setText(value1);
				 break;
			 case "x":
				 int product = ivalue1 * ivalue2;
				 value1 = Integer.toString(product);
				 textField.setText(value1);
				 break;
			 case "/":
				 int quotient = ivalue1 / ivalue2;
				 value1 = Integer.toString(quotient);
				 textField.setText(value1);
				 break;
			 case "%":
				 int modulo = ivalue1 % ivalue2;
				 value1 = Integer.toString(modulo);
				 textField.setText(value1);
				 break;
			 }
			 
	
		 }
		 }
		
	}