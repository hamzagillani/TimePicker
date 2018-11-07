package com.digicon_valley.timepicker;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;

import android.support.v4.app.DialogFragment;

import java.util.Calendar;

public class Time_Picker_Handler extends DialogFragment {


    @Override
    public Dialog onCreateDialog( Bundle savedInstanceState) {


        Calendar calendar=Calendar.getInstance();

        int hour=calendar.get(Calendar.HOUR_OF_DAY);
        int minute=calendar.get(Calendar.MINUTE);
        TimePickerDialog dialog;
        Time_Setting time_setting=new Time_Setting(getActivity());
        dialog=new TimePickerDialog(getActivity(),time_setting,hour,minute,
                true);
        return dialog;

        //return super.onCreateDialog(savedInstanceState);
    }
}
