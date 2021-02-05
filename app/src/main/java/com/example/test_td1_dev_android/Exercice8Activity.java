package com.example.test_td1_dev_android;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class Exercice8Activity extends AppCompatActivity {

    ListView mListView;
    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex8_tp);
        mListView = findViewById(R.id.listView);
        confirm = findViewById(R.id.confirm_horaire);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                afficherListeHoraires();
            }
        });
    }

    private List<Horaire> genererHoraires() {
        List<Horaire> horaires = new ArrayList<Horaire>();
        horaires.add(new Horaire("Marseille", "Montpellier", "12h15"));
        horaires.add(new Horaire("Marseille", "Montpellier", "12h35"));
        horaires.add(new Horaire("Marseille", "Montpellier", "15h00"));
        horaires.add(new Horaire("Marseille", "Montpellier", "15h00"));
        horaires.add(new Horaire("Marseille", "Montpellier", "15h00"));
        for (int i = 0; i < 100; i++) {
            horaires.add(new Horaire("Marseille", "Montpellier", i + "h" + i));
        }
        return horaires;
    }

    private void afficherListeHoraires() {
        List<Horaire> horaires = genererHoraires();

        HoraireAdapter adapter = new HoraireAdapter(this, horaires);
        mListView.setAdapter(adapter);
    }

}


