package com.example.test_td1_dev_android;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Exercice2XMLActivity extends AppCompatActivity {

    Button confirmButton;
    EditText firstName, lastName, age;
    Context context = this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex2_tp);

        confirmButton = findViewById(R.id.button_validation);
        firstName = findViewById(R.id.first_name);
        lastName = findViewById(R.id.last_name);
        age = findViewById(R.id.age);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Hello " + firstName.getText().toString() + " " + lastName.getText().toString(), Toast.LENGTH_SHORT).show();
                AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);

                alertBuilder.setTitle("Confirmation");
                alertBuilder.setCancelable(true).setMessage("Do you confirm your informations ?").
                        setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                View mainLayout = findViewById(R.id.mainLayout);
                                mainLayout.setBackgroundColor(Color.GREEN);

                                Intent goToNext = new Intent(context, ActivityTwo.class);

                                goToNext.putExtra("FirstName", firstName.getText().toString());
                                goToNext.putExtra("LastName", lastName.getText().toString());
                                goToNext.putExtra("Age", age.getText().toString());
                                startActivity(goToNext);
                            }
                        }).setNegativeButton("Change", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
                AlertDialog dialog = alertBuilder.create();
                dialog.show();
            }
        });
    }
}
