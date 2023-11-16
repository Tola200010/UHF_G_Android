package com.pda.uhf_g.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

import com.pda.uhf_g.R;

public class LoadingAlert {
    Activity activity;
    AlertDialog dialog;
    public LoadingAlert(Activity myActivity){
        activity = myActivity;
    }
   public void startAlertDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.dailog_layout,null));
        builder.setCancelable(true);
        dialog = builder.create();
        dialog.show();
    }

   public void closeAlertDialog(){
        dialog.dismiss();
    }
}
