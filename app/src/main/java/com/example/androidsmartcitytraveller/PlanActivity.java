package com.example.androidsmartcitytraveller;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PlanActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);

        Button submitOpinionButton = findViewById(R.id.submitOpinionButton);

    }

    private void showOpinionDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.activity_plan, null);
        Button showAlertDialogButton = findViewById(R.id.showAlertDialogButton);

        showAlertDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create AlertDialog builder
                AlertDialog.Builder builder = new AlertDialog.Builder(PlanActivity.this);

                // Set title and message for the AlertDialog
                builder.setTitle("Alert!");
                builder.setMessage(".");

                // Add positive button to the AlertDialog
                builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when the user clicks the positive button
                        Toast.makeText(PlanActivity.this, "submitted successfully", Toast.LENGTH_SHORT).show();
                    }
                });

                // Add negative button to the AlertDialog
                builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something when the user clicks the negative button
                        Toast.makeText(PlanActivity.this, "Cancel clicked", Toast.LENGTH_SHORT).show();
                    }
                });

                // Show the AlertDialog
                AlertDialog alertDialog = builder.create();
                alertDialog.show();
            }
        });

    }
}
