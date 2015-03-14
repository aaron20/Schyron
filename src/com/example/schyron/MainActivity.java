package com.example.schyron;

import myappschyrondelrosarioproject.ITE.R;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	
	}

	 public void calculateClickHandler(View view) {
	     // make sure we handle the click of the calculator button

	     if (view.getId() == R.id.calculateButton) {

	      // get the references to the widgets
	      EditText weightText = (EditText)findViewById(R.id.weightText);
	      EditText heightText = (EditText)findViewById(R.id.heightText);
	      TextView resultText = (TextView)findViewById(R.id.resultLabel);
	 
	      // get the users values from the widget references

	      float weight = Float.parseFloat(weightText.getText().toString());
	      float height = Float.parseFloat(heightText.getText().toString());
	 
	      // calculate the bmi value

	      float bmiValue = calculateBMI(weight, height);
	 
	      // interpret the meaning of the bmi value
	      String bmiInterpretation = interpretBMI(bmiValue);
	 
	      // now set the value in the result text

	      resultText.setText(bmiValue + "-" + bmiInterpretation);
	     }
	    }
	 
	    // the formula to calculate the BMI index

	  
	    private float calculateBMI (float weight, float height) {

	     return (float) (weight * 4.88 / (height * height));
	    }

	 
	    // interpret what BMI means
	    private String interpretBMI(float bmiValue) {

	     if (bmiValue < 16) {
	      return "Severely underweight";
	     } else if (bmiValue < 18.5) {

	      return "Underweight";
	     } else if (bmiValue < 25) {

	      return "Normal";
	     } else if (bmiValue < 30) {

	      return "Overweight";
	     } else {
	      return "Obese";
	     }

	    }
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}



