package com.example.keng.sdsu_code24hrs;

import android.location.Location;

import com.google.android.gms.location.LocationListener;

/**
 * Created by Keng on 11/18/2016.
 */

public class MyCurrentLocationListener implements LocationListener {
    @Override
    public void onLocationChanged(Location location) {
        location.getLatitude();
        location.getLongitude();

        String myLocation = "Latitude = " + location.getLatitude() + " Longitude = " + location.getLongitude();

        //I make a log to see the results


    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {

    }

    @Override
    public void onProviderEnabled(String s) {

    }

    @Override
    public void onProviderDisabled(String s) {

    }
}
