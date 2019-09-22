package com.arent.ui.newvehicle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.arent.App;
import com.arent.R;
import com.arent.model.VehicleBrand;
import com.arent.repository.remote.IRemoteStorage;
import com.arent.utils.Logger;

import java.util.List;

public class NewVehicleActivity extends AppCompatActivity {

    public static void startActivity(Context context){
        context.startActivity(new Intent(context, NewVehicleActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_vehicle);
        App.remoteStorage.getVehicleBrands(new IRemoteStorage.GetFromRemoteStorageCallback<List<VehicleBrand>>() {
            @Override
            public void onSucces(List<VehicleBrand> data) {
                Logger.message(data.get(0).getBrand());
            }

            @Override
            public void onFailure(String message) {
                Logger.message(message);
            }
        });
    }

    public void onSelectBrandClick(View view) {


    }
}
