package com.arent.ui.main.mycarsfragment;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arent.R;
import com.arent.ui.main.phoneauthintication.PhoneAuthActivity;

public class MyCarsFragment extends Fragment {

    private MyCarsFragmentViewModel mViewModel;

    public static MyCarsFragment newInstance() {
        return new MyCarsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_cars_initial_fragment, container, false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MyCarsFragmentViewModel.class);
        // TODO: Use the ViewModel
        PhoneAuthActivity.startActivity(getContext());
    }

}
