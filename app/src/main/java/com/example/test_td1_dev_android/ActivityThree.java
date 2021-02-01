package com.example.test_td1_dev_android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ActivityThree extends AppCompatActivity {

    TextView phoneToDial;
    Button call;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        String phoneNumber = getIntent().getExtras().getString("Phone");

        phoneToDial = findViewById(R.id.phoneDial);
        call = findViewById(R.id.call);
        phoneToDial.setText(phoneNumber);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + phoneNumber));
                startActivity(intent);
            }
        });

    }
}
