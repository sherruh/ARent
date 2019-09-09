package com.arent.ui.main.myvehiclesfragment;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arent.R;
import com.arent.ui.newvehicle.NewVehicleActivity;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MyVehicles extends Fragment {

    private MyVehiclesViewModel mViewModel;
    private FloatingActionButton fbNewVehicle;

    public static MyVehicles newInstance() {
        return new MyVehicles();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_vehicles_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MyVehiclesViewModel.class);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fbNewVehicle = getActivity().findViewById(R.id.my_vehicles_fragment_new_vehicle);
        fbNewVehicle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NewVehicleActivity.startActivity(getContext());
            }
        });
    }
}
