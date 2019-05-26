package com.example.silvano.tris;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton b11,b12,b13,b21,b22,b23,b31,b32,b33;
    int  mosse;
    Tris tris;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b11 = findViewById(R.id.b_1_1);
        b11.setOnClickListener(this);
        b12 = findViewById(R.id.b_1_2);
        b12.setOnClickListener(this);
        b13 = findViewById(R.id.b_1_3);
        b13.setOnClickListener(this);
        b21 = findViewById(R.id.b_2_1);
        b21.setOnClickListener(this);
        b22 = findViewById(R.id.b_2_2);
        b22.setOnClickListener(this);
        b23 = findViewById(R.id.b_2_3);
        b23.setOnClickListener(this);
        b31 = findViewById(R.id.b_3_1);
        b31.setOnClickListener(this);
        b32 = findViewById(R.id.b_3_2);
        b32.setOnClickListener(this);
        b33 = findViewById(R.id.b_3_3);
        b33.setOnClickListener(this);
        mosse = 1;
        tris = new Tris();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.b_1_1:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(11,0);
                    if (!occupato){
                        b11.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(11,1);
                    if (!occupato){
                        b11.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
            case R.id.b_1_2:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(12,0);
                    if (!occupato){
                        b12.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(12,1);
                    if (!occupato){
                        b12.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
            case R.id.b_1_3:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(13,0);
                    if (!occupato){
                        b13.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(13,1);
                    if (!occupato){
                        b13.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
            case R.id.b_2_1:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(21,0);
                    if (!occupato){
                        b21.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(21,1);
                    if (!occupato){
                        b21.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
            case R.id.b_2_2:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(22,0);
                    if (!occupato){
                        b22.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(22,1);
                    if (!occupato){
                        b22.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
            case R.id.b_2_3:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(23,0);
                    if (!occupato){
                        b23.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(23,1);
                    if (!occupato){
                        b23.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
            case R.id.b_3_1:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(31,0);
                    if (!occupato){
                        b31.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(31,1);
                    if (!occupato){
                        b31.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
            case R.id.b_3_2:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(32,0);
                    if (!occupato){
                        b32.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(32,1);
                    if (!occupato){
                        b32.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
            case R.id.b_3_3:
                if (mosse % 2 == 0){
                    boolean occupato = tris.inserisci(33,0);
                    if (!occupato){
                        b33.setImageResource(R.drawable.x);
                    }
                } else {
                    boolean occupato = tris.inserisci(33,1);
                    if (!occupato){
                        b33.setImageResource(R.drawable.o);
                    }
                }
                mosse ++;
                break;
        }
        if (mosse >= 5){
            int vinto = tris.vinto();
            String giocatore = "" + (vinto + 1);
            if (vinto != 2){
                Intent i = new Intent(MainActivity.this, Vinto.class);
                i.putExtra("giocatore", giocatore );
                startActivity(i);
                finish();
            }
        }

    }
}
