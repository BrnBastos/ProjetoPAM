package com.example.learn;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.location.LocationListener;
import android.os.Bundle;

public class Location implements LocationListener {
    public static double latitude;
    public static double longitude;

    @Override
    public void onLocationChanged(android.location.Location location) {
        this.latitude  = location.getLatitude();
        this.longitude = location.getLongitude();
    }

    @Override
    public void onProviderDisabled(@NonNull String provider) {
    }

    @Override
    public void onProviderEnabled(@NonNull String provider) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }
}