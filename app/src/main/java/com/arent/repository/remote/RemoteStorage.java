package com.arent.repository.remote;

import androidx.annotation.NonNull;

import com.arent.model.VehicleBrand;
import com.arent.utils.Logger;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

public class RemoteStorage implements IRemoteStorage {

    private final String TABLE_VEHICLE_BRANDS = "vehicle_list";
    private final String TABLE_CITIES = "cities";
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private StorageReference storageReference = FirebaseStorage.getInstance().getReference();;

    @Override
    public void getVehicleBrands(final GetFromRemoteStorageCallback<List<VehicleBrand>> getFromRemoteStorageCallback) {

        db.collection(TABLE_VEHICLE_BRANDS)
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            List<VehicleBrand> vehicleBrands = new ArrayList<>();
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                vehicleBrands.add(document.toObject(VehicleBrand.class));
                            }
                            getFromRemoteStorageCallback.onSucces(vehicleBrands);
                        } else {
                            getFromRemoteStorageCallback.onFailure(task.getException().getMessage());
                        }
                    }
                });



    }
}
