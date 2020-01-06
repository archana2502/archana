package com.example.myapplication54;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

public class CalendarActivity<calendarView> extends AppCompatActivity {
    Button  btn1;
    CalendarView calendarView;
    TextView myDate;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);

        calendarView=(CalendarView) findViewById(R.id.calendarView);
        myDate =(TextView) findViewById(R.id.myDate);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date=(i1+1)+ "/"+i2+"/"+i;
                myDate.setText(date);



            }




        });


    }
}
