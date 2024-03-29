package com.arent;

import android.app.Application;

import com.arent.repository.remote.IRemoteStorage;
import com.arent.repository.remote.RemoteStorage;
import com.arent.utils.Logger;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class App extends Application {

    public static IRemoteStorage remoteStorage;
    public static FirebaseAuth firebaseAuth;
    public static FirebaseUser firebaseUser;
    public static boolean isLogged = true;

    @Override
    public void onCreate() {
        super.onCreate();
        remoteStorage = new RemoteStorage();
        getFirebaseUser();
        if (firebaseUser == null) isLogged = false;
    }

    public static boolean isLoggedIn(){
        getFirebaseUser();
        if(firebaseUser == null) {
            isLogged = false;
            return false;
        }
        else {
            Logger.message(firebaseAuth.getCurrentUser().getPhoneNumber());
            isLogged = true;
            return true;
        }
    }

    private static void getFirebaseUser(){
        firebaseAuth = FirebaseAuth.getInstance();
        firebaseUser = firebaseAuth.getCurrentUser();
    }
}
