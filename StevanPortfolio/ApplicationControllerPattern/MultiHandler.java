import java.util.ArrayList;
import javax.xml.ws.handler.Handler;

public class MultiHandler implements Handler {
	private double value1;
	private double value2;
	private double result;
	private String resultString;

	public void handleIt(Object... parameters) {

		// pull the CalculatorActivity from the Calculator class and assigns to
		// activity
		CalculatorActivity activity = (CalculatorActivity) parameters[0];
		// declare Textviews from textViews pass from Calculator

		TextView inputTxt = (TextView) parameters[1];
		TextView solutionTxt = (TextView) parameters[2];

		value1 = Double.parseDouble(inputTxt.getText().toString());
		value2 = Double.parseDouble(solutionTxt.getText().toString());

		result = (value1 * value2);

		resultString = Double.toString(result);

		solutionTxt.setText(resultString);

		inputTxt.setText("");

	}

}
