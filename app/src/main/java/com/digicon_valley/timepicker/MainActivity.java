package com.digicon_valley.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }

    public void showDialod(View view) {

        Date_Picker_Handler date_picker_handler=new Date_Picker_Handler();
        date_picker_handler.show(getSupportFragmentManager(),"Date_Picker");

        Time_Picker_Handler dialodhandler=new Time_Picker_Handler();
        dialodhandler.show(getSupportFragmentManager(),"Time_picker");
    }

    public void showTime(View view) {

        Time_Picker_Handler dialodhandler=new Time_Picker_Handler();
        dialodhandler.show(getSupportFragmentManager(),"Time_picker");
    }

    public void showDate(View view) {


        Date_Picker_Handler date_picker_handler=new Date_Picker_Handler();
        date_picker_handler.show(getSupportFragmentManager(),"Date_Picker");
    }
}
