package com.arent.ui.main.myvehiclesfragment.initial;

import androidx.lifecycle.ViewModel;

import com.arent.App;
import com.arent.core.SingleLiveEvent;

public class MyVehiclesInitialFragmentViewModel extends ViewModel {

    SingleLiveEvent<Void> loggedEvent = new SingleLiveEvent<>();


    public void isLoggedIn() {
        if( App.isLoggedIn()) loggedEvent.call();
    }
}
