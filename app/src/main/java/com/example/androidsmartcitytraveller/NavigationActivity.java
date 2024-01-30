package com.example.androidsmartcitytraveller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;

public class NavigationActivity extends AppCompatActivity {
   TextView tv_lattitude,tv_longtitude,tv_Altitude,tv_update,tv_Address ;

   //google'sAPI fo location services.
   FusedLocationProviderClient fusedLocationProviderClient;
   LocationRequest locationRequest;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);

        tv_lattitude=findViewById(R.id.tv_lattitude);
        tv_longtitude=findViewById(R.id.tv_longtitude);
        tv_Address=findViewById(R.id.tv_Address);

        }
    }
