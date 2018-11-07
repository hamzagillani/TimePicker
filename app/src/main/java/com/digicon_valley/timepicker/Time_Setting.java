package com.digicon_valley.timepicker;

import android.app.TimePickerDialog;
import android.content.Context;
import android.widget.TimePicker;
import android.widget.Toast;

public class Time_Setting implements TimePickerDialog.OnTimeSetListener {
   Context context;
   public Time_Setting(Context context){
       this.context=context;
   }


    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

        Toast.makeText(context,"Selected Time is Hour :"+hourOfDay+" Minute "+minute,Toast.LENGTH_SHORT).show();

    }
}
