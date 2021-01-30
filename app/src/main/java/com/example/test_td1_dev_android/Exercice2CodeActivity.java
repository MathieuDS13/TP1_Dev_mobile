package com.example.test_td1_dev_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Exercice2CodeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //On crée le layout
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setOrientation(LinearLayout.VERTICAL);

        setContentView(mainLayout);
        //On ajoute les champs au fur et à mesure

        //Prénom
        TextView firstName = new TextView(this);
        EditText firstNameField = new EditText(this);
        firstName.setText(R.string.first_name);
        firstNameField.setText(R.string.first_name);

        //Nom de famille
        TextView lastName = new TextView(this);
        EditText lastNameField = new EditText(this);
        lastName.setText(R.string.last_name);
        lastNameField.setText(R.string.last_name);

        //Age
        TextView age = new TextView(this);
        EditText ageField = new EditText(this);
        age.setText(R.string.age);
        ageField.setText(R.string.age);

        //Domaine de compétences
        TextView fieldOfExpertise = new TextView(this);
        EditText fieldOfExpertiseField = new EditText(this);
        fieldOfExpertise.setText(R.string.field_expertise);
        fieldOfExpertiseField.setText(R.string.field_expertise);

        //Numéro de téléphone
        TextView phone = new TextView(this);
        EditText phoneField = new EditText(this);
        phone.setText(R.string.phone_number);
        phoneField.setText(R.string.phone_number);

        //Bouton de confirmation
        Button confirmButton = new Button(this);
        confirmButton.setText(R.string.button_validation);
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Bonjour " + firstNameField.getText().toString() + " " + lastNameField.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });

        //On ajoute tout au layout
        mainLayout.addView(firstName);
        mainLayout.addView(firstNameField);
        mainLayout.addView(lastName);
        mainLayout.addView(lastNameField);
        mainLayout.addView(age);
        mainLayout.addView(ageField);
        mainLayout.addView(fieldOfExpertise);
        mainLayout.addView(fieldOfExpertiseField);
        mainLayout.addView(phone);
        mainLayout.addView(phoneField);
        mainLayout.addView(confirmButton);

    }
}
