package com.example.test_td1_dev_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button longButton;
    private Button magicButton;
    private TextView exercice4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.mainbutton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Toast.makeText(getApplicationContext(), "Message Bouton 1", Toast.LENGTH_LONG).show();
            }
        });

        longButton = (Button) findViewById(R.id.longButton);
        longButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(getApplicationContext(), "Loooooong message", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        exercice4 = findViewById(R.id.exercie4);
        magicButton = findViewById(R.id.magic);
        magicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exercice4.setVisibility(View.VISIBLE);
            }
        });
    }
}