package com.arent.ui.main.myvehiclesfragment.initial;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arent.R;
import com.arent.ui.main.MainActivity;
import com.arent.ui.phoneauthintication.PhoneAuthActivity;

public class MyVehiclesInitialFragment extends Fragment {

    public static MyVehiclesInitialFragment newInstance() {
        return new MyVehiclesInitialFragment();
    }

    private MyVehiclesInitialFragmentViewModel mViewModel;
    private TextView tvGetStared;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_vehicles_initial_fragment, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        tvGetStared = getActivity().findViewById(R.id.my_vehicles_initial_fragment_tv_start);
        tvGetStared.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PhoneAuthActivity.startActivity(getContext());
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MyVehiclesInitialFragmentViewModel.class);
        mViewModel.loggedEvent.observe(this, new Observer<Void>() {
            @Override
            public void onChanged(Void aVoid) {
                ((MainActivity)getActivity()).navView
                        .setSelectedItemId(R.id.navigation_my_vehicles_fragment);
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        mViewModel.isLoggedIn();
    }

}
