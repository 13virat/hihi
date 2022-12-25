package com.example.unitconverter;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {

    CardView cv_tmp;
    CardView cv_weight;
    CardView cv_length;
    CardView cv_speed;
    CardView cv_volume;
    CardView cv_time;
    CardView cv_area;
    CardView cv_fuel;
    CardView cv_pressure;
    CardView cv_energy;
    CardView cv_storage;
    CardView cv_current;
    CardView cv_force;
    CardView cv_freq;
    CardView cv_resistance;
    CardView cv_power;
    CardView cv_torque;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cv_tmp = findViewById(R.id.cv_tmp);
        cv_weight = findViewById(R.id.cv_weight);
        cv_length = findViewById(R.id.cv_length);
        cv_speed = findViewById(R.id.cv_speed);
        cv_volume = findViewById(R.id.cv_Volume);
        cv_time = findViewById(R.id.cv_time);
        cv_area = findViewById(R.id.cv_area);
        cv_fuel = findViewById(R.id.cv_fuel);
        cv_pressure = findViewById(R.id.cv_pressure);
        cv_energy = findViewById(R.id.cv_energy);
        cv_storage = findViewById(R.id.cv_storage);
        cv_current = findViewById(R.id.cv_current);
        cv_force = findViewById(R.id.cv_force);
        cv_freq = findViewById(R.id.cv_frequency);
        cv_resistance = findViewById(R.id.cv_resistence);
        cv_power = findViewById(R.id.cv_power);
        cv_torque = findViewById(R.id.cv_torque);

        cv_tmp.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, temp_cal.class)));
        cv_weight.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, weight_cal.class)));
        cv_length.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, length_cal.class)));
        cv_speed.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, speed_cal.class)));
        cv_volume.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, volume_cal.class)));
        cv_time.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, time_cal.class)));
        cv_area.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, area_cal.class)));
        cv_fuel.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, fuel_cal.class)));
        cv_pressure.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, pressure_cal.class)));
        cv_energy.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, energy_cal.class)));
        cv_storage.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, storage_cal.class)));
        cv_current.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, current_cal.class)));
        cv_force.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, force_cal.class)));
        cv_freq.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, freq_cal.class)));
        cv_resistance.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, resistance_cal.class)));
        cv_power.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, power_cal.class)));
        cv_torque.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, torque_cal.class)));

    }
}