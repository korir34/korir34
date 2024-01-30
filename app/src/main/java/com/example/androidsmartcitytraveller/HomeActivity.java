package com.example.androidsmartcitytraveller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    CardView cardFDLocation, cardFDOpnion, cardFDBestRoutesCardView, cardFDRestuarant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        CardView exit = findViewById(R.id.cardFDBack);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, MainActivity.class));
            }
        });

        CardView Get_Location = findViewById(R.id.cardFDLocation);
        Get_Location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(HomeActivity.this, GoogleMapsActivity.class);
                it.putExtra("title", "Google Maps");
                startActivity(it);
            }
        });

        TextView rateUs = findViewById(R.id.titleRateUs);
        rateUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(HomeActivity.this, RateUS.class);
                it.putExtra("title", "Rate Us");
                startActivity(it);
            }
        });

        CardView FDBestRoutes = findViewById(R.id.cardFDBestRoutes);
        FDBestRoutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(HomeActivity.this, MainActivity2.class);
                it.putExtra("title", "google");
                startActivity(it);
            }

        });
        CardView opinion= findViewById(R.id.cardFDOpnion);
        opinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(HomeActivity.this, PlanActivity.class);
                it.putExtra("title", "opinion");
                startActivity(it);

            }
        });

    }
}