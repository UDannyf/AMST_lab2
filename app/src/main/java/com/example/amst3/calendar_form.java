package com.example.amst3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

public class calendar_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar_form);
          calendario = findViewById(R.id.calendario);
        tareas = findViewById(R.id.tareas);
        tareas.setText("Hacer el desafío de ASMT");
        calendario.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
            tareas.setText("No hay tareas disponibles");
            }
        });
    }
}
