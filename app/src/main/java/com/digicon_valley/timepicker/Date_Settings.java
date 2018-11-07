package com.digicon_valley.timepicker;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;
import android.widget.Toast;

public class Date_Settings implements DatePickerDialog.OnDateSetListener {

Context context;

public Date_Settings(Context context){
    this.context=context;
}


    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {


        Toast.makeText(context,"Selected Date :"+dayOfMonth+ " / "+dayOfMonth+" / "+year,Toast.LENGTH_SHORT).show();


    }
}
