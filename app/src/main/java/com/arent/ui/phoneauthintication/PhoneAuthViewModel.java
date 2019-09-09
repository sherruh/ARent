package com.arent.ui.phoneauthintication;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class PhoneAuthViewModel extends ViewModel {
    public MutableLiveData<Boolean> isWaitingCode = new MutableLiveData<>();

    public void waitCode(){
        isWaitingCode.setValue(true);
    }

    public void start(){
        isWaitingCode.setValue(false);
    }
}
