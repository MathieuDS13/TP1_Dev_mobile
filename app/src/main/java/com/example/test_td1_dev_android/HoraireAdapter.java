package com.example.test_td1_dev_android;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class HoraireAdapter extends ArrayAdapter<Horaire> {
    public HoraireAdapter(@NonNull Context context, List<Horaire> horaires) {
        super(context, 0, horaires);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.raw_horaire, parent, false);
        }

        HoraireViewHolder viewHolder = (HoraireViewHolder) convertView.getTag();
        if (viewHolder == null) {
            viewHolder = new HoraireViewHolder();
            viewHolder.villeDepart = convertView.findViewById(R.id.depart);
            viewHolder.villeArrivee = convertView.findViewById(R.id.arrivee);
            viewHolder.horaire = convertView.findViewById(R.id.horaire);
            convertView.setTag(viewHolder);
        }

        Horaire horaire = getItem(position);
        viewHolder.villeDepart.setText(horaire.getVilleDepart());
        viewHolder.villeArrivee.setText(horaire.getVilleArrivee());
        viewHolder.horaire.setText(horaire.getHoraire());

        return convertView;
    }

    private class HoraireViewHolder {
        public TextView villeDepart, villeArrivee, horaire;
    }

}
