package com.example.test_td1_dev_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Exercice8Activity extends AppCompatActivity {

    ListView mListView;
    Button confirm;
    EditText depart, arrivee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex8_tp);
        mListView = findViewById(R.id.listView);
        confirm = findViewById(R.id.confirm_horaire);
        depart = findViewById(R.id.form_depart);
        arrivee = findViewById(R.id.form_arrivee);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherListeHoraires();
            }
        });
    }

    private List<Horaire> genererHoraires() {
        List<Horaire> horaires = new ArrayList<Horaire>();
        for (int i = 0; i < 100; i++) {
            horaires.add(new Horaire(depart.getText().toString(), arrivee.getText().toString(), i + "h" + i));
        }
        return horaires;
    }

    private void afficherListeHoraires() {
        List<Horaire> horaires = genererHoraires();

        HoraireAdapter adapter = new HoraireAdapter(this, horaires);
        mListView.setAdapter(adapter);
    }

}


