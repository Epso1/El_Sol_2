package com.example.elsol2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class CompararPlanetasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comparar_planetas);

        ArrayList<Planeta> planetas = new ArrayList<>(
                Arrays.asList(
                        new Planeta("Mercurio", "0,382", "0,387", "5400"),
                        new Planeta("Venus", "0,949", "0,723", "5250"),
                        new Planeta("Tierra", "1", "1", "5520"),
                        new Planeta("Marte", "0,53", "1,542", "3960"),
                        new Planeta("Júpiter", "11,2", "5,203", "1350"),
                        new Planeta("Saturno", "9,41", "9,539", "700"),
                        new Planeta("Urano", "3,38", "19,81", "1200"),
                        new Planeta("Neptuno", "3,81", "30,07", "1500"),
                        new Planeta("Plutón", "???", "39,44", "5?")
                )
        );



        AutoCompleteTextView autoCompleteTextView1 = findViewById(R.id.autocomplete_planeta1);
        AutoCompleteTextView autoCompleteTextView2 = findViewById(R.id.autocomplete_planeta2);

        ArrayAdapter<Planeta> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, planetas);
        ArrayAdapter<Planeta> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, planetas);

        autoCompleteTextView1.setAdapter(adapter);
        autoCompleteTextView2.setAdapter(adapter2);

        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Planeta planeta = (Planeta) parent.getItemAtPosition(position);

                TextView diametroPlaneta = findViewById(R.id.diametroPlaneta1);
                diametroPlaneta.setText(planeta.getDiametro());

                TextView distanciaPlaneta = findViewById(R.id.distanciaAlSolPlaneta1);
                distanciaPlaneta.setText(planeta.getDistanciaAlSol());

                TextView densidadPlaneta = findViewById(R.id.densidadPlaneta1);
                densidadPlaneta.setText(planeta.getDensidad());

            }
        });

        autoCompleteTextView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, android.view.View view, int position, long id) {
                Planeta planeta = (Planeta) parent.getItemAtPosition(position);

                TextView diametroPlaneta = findViewById(R.id.diametroPlaneta2);
                diametroPlaneta.setText(planeta.getDiametro());

                TextView distanciaPlaneta = findViewById(R.id.distanciaAlSolPlaneta2);
                distanciaPlaneta.setText(planeta.getDistanciaAlSol());

                TextView densidadPlaneta = findViewById(R.id.densidadPlaneta2);
                densidadPlaneta.setText(planeta.getDensidad());

            }
        });

    }
}