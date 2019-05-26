package com.example.silvano.tris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Vinto extends AppCompatActivity implements View.OnClickListener {

    Button nuovaPartita, chiudi;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vinto);
        nuovaPartita = findViewById(R.id.nuova_partita);
        nuovaPartita.setOnClickListener(this);
        chiudi = findViewById(R.id.chiudi);
        chiudi.setOnClickListener(this);
        textView = findViewById(R.id.t_vinto);
        Intent i = getIntent();
        String giocatore = i.getStringExtra("giocatore");
        textView.setText("Giocatore" + giocatore  + " ha vinto" );

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.nuova_partita:
                Intent i = new Intent(Vinto.this, MainActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.chiudi:
                finish();
        }
    }
}
