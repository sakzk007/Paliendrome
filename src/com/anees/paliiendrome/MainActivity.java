package com.anees.paliiendrome;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.app.Activity;

public class MainActivity extends Activity {

	Button btnCheck;
	EditText etText;
	CheckBox chkBox;
	AlertDialogManager alrt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initVars();
		btnCheck.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Check whether the checkbox is check or not
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
				Log.d("String", t1);
				txt.append(t1);
				if (txt.length() != 0 || txt != null) {
					String t2 = txt.reverse().toString();
					if (t1.equalsIgnoreCase(t2)) {
						Log.d("Paliendrome", "True");
						alrt = new AlertDialogManager();
						alrt.showAlertDialog(MainActivity.this,
								"checking", t2+" is Paliendrome", true);
					}
					else{
						Log.d("Paliendrome", "False");
					}

				}

			}
		});
	}

	private void initVars() {
		// TODO Auto-generated method stub
		btnCheck = (Button) findViewById(R.id.button1);
		etText = (EditText) findViewById(R.id.editText1);
		chkBox = (CheckBox) findViewById(R.id.checkBox1);
	}

}
