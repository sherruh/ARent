package com.arent.ui.newvehicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.arent.R;

public class NewVehicleActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, NewVehicleActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_vehicle);
    }
}
