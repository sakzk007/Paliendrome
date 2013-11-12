package com.anees.paliiendrome;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
  
public class AlertDialogManager {
    public void showAlertDialog(final Context context, String title, String message,
            Boolean status) {
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
//        alertDialog.setTitle(title);
        alertDialog.setMessage(message);
  
       /* if(status != null)*/
            // Setting alert dialog icon
//            alertDialog.setIcon((status) ? R.drawable.success : R.drawable.fail);
  
        // Setting OK Button
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            	
            }
        });
  
        // Showing Alert Message
        alertDialog.show();
    }
}