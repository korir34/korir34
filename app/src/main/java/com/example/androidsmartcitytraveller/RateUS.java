package com.example.androidsmartcitytraveller;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.Toast;

public class RateUS extends AppCompatActivity {

    Button btnBack;
    Button button;
    RatingBar ratingStars;

    float myRating = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate_us2);

        btnBack = findViewById(R.id.buttonBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(RateUS.this, HomeActivity.class));
            }
        });

        button = findViewById(R.id.button);
        ratingStars = findViewById(R.id.ratingBar);

        ratingStars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                int rating = (int) v;
                String message = null;

                myRating = ratingBar.getRating();

                switch (rating){
                    case 1:
                        message = "Sorry to hear that!";
                        break;
                    case 2:
                        message = "We accept suggestions to help us improve!";
                        break;
                    case 3:
                        message = "Good Enough!";
                        break;
                    case 4:
                        message = "Great ThankYou!";
                        break;
                    case 5:
                        message = "Awesome!";
                        break;
                }

                Toast.makeText(RateUS.this, message , Toast.LENGTH_SHORT).show();

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(RateUS.this, "Your Rating Is: " +myRating, Toast.LENGTH_SHORT).show();

            }
        });



    }
}

