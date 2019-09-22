package com.arent.repository.remote;

import com.arent.model.VehicleBrand;

import java.util.List;

public interface IRemoteStorage {

    void getVehicleBrands(GetFromRemoteStorageCallback<List<VehicleBrand>> getFromRemoteStorageCallback);

    public interface WriteToRemoteStorageCallback{

        public void onSucces();

        public void onFailure(String message);

    }

    public interface GetFromRemoteStorageCallback<T>{

        void onSucces(T data);

        void onFailure(String message);


    }
}
