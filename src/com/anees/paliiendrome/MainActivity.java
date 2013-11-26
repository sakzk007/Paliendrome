package com.anees.paliiendrome;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

    private Button btnCheck;
    private EditText etText;
    private CheckBox chkBox;
    private AlertDialogManager alrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	initVars();
	btnCheck.setOnClickListener(new View.OnClickListener() {

	    @Override
	    public void onClick(View v) {
		// Check whether the check-box is checked or not
		Log.d("Clicked", "True");
		if (chkBox.isChecked() == true) {
		    // Show alert
		    Log.d("Checked", "True");
		    showAlertByChecking();
		}
	    }

	    private void showAlertByChecking() {
		StringBuffer txt = new StringBuffer();
		String t1 = etText.getText().toString().trim();
		txt.append(t1);
		// Checking entered Text is whether empty
		if (t1.length() != 0 && t1 != null) {
		    Log.d("Paliendrome String", t1);
		    if (alrt == null) {
			Log.d("Alert Dialog Object", "Empty");
			alrt = new AlertDialogManager();
		    }
		    if (t1.equalsIgnoreCase(txt.reverse().toString())) {
			Log.d("Paliendrome", "True-");

			alrt.showAlertDialog(MainActivity.this, "checking", t1 + " is Paliendrome", true);
		    } else {
			alrt.showAlertDialog(MainActivity.this, "checking", t1 + " is not Paliendrome", true);
		    }

		} else {
		    Toast.makeText(getApplicationContext(), "Field is Empty!", Toast.LENGTH_SHORT).show();
		}

	    }
	});
    }

    private void initVars() {
	btnCheck = (Button) findViewById(R.id.button1);
	etText = (EditText) findViewById(R.id.editText1);
	chkBox = (CheckBox) findViewById(R.id.checkBox1);
    }

}
