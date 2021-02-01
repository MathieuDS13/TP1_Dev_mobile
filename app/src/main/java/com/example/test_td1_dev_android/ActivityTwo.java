package com.example.test_td1_dev_android;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Context context = this;

        Bundle extras = getIntent().getExtras();

        String firstName, lastName, age;
        lastName = extras.getString("LastName");
        firstName = extras.getString("FirstName");
        age = extras.getString("Age");

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        TextView text = new TextView(this);
        text.setText("Bonjour " + firstName + " " + lastName + " vous avez " + age + " ans !");
        layout.addView(text);

        Button ok = new Button(this);
        ok.setText("Ok");
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent thirdActivity = new Intent(context, ActivityThree.class);
                startActivity(thirdActivity);
            }
        });
        layout.addView(ok);

        Button returnButton = new Button(this);
        returnButton.setText("Return");
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        layout.addView(returnButton);

        setContentView(layout);
    }
}
