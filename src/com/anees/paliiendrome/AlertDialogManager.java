package com.anees.paliiendrome;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class AlertDialogManager {
    @SuppressWarnings("deprecation")
    public void showAlertDialog(final Context context, String title, String message, Boolean status) {
	AlertDialog alertDialog = new AlertDialog.Builder(context).create();
	// alertDialog.setTitle(title);
	alertDialog.setMessage(message);
	// Setting OK Button
	alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
	    public void onClick(DialogInterface dialog, int which) {
		dialog.dismiss();
	    }
	});
	// Showing Alert Message
	alertDialog.show();
    }
}