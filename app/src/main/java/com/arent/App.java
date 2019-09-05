package com.arent;

import android.app.Application;

import com.arent.utils.Logger;
import com.google.firebase.auth.FirebaseAuth;

public class App extends Application {

    private FirebaseAuth mAuth;

    @Override
    public void onCreate() {
        super.onCreate();
        mAuth = FirebaseAuth.getInstance();
        Logger.message(mAuth.getCurrentUser().getPhoneNumber());
    }
}
