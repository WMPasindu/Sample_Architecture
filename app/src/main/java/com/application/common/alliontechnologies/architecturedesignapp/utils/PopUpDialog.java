package com.application.common.alliontechnologies.architecturedesignapp.utils;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

import com.application.common.alliontechnologies.architecturedesignapp.events.PopUpActionEvent;

public class PopUpDialog {

    public static void PopUpDialogShow(String sTitle, String sMessage, final Context myContext, final PopUpActionEvent popUpActionEvent) {
        AlertDialog.Builder builder = new AlertDialog.Builder(myContext);

        builder
                .setTitle(sTitle)
                .setMessage(sMessage)
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //Yes button clicked, do something

                        popUpActionEvent.onYesClicked();
                    }
                })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //no button clicked, do something

                        popUpActionEvent.onNoClicked();
                    }
                })
                .show();
    }
}
