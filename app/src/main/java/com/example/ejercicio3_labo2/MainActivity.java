package com.example.ejercicio3_labo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private LinearLayout LRojo;
    private  LinearLayout LAzul;
    private LinearLayout LVerde;
    private int aux;
    private int color;
    private ArrayList<Integer> Rojos = new ArrayList<Integer>();
    private ArrayList<Integer> Verde = new ArrayList<Integer>();
    private ArrayList<Integer> Azul = new ArrayList<Integer>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LAzul=findViewById(R.id.azul);
        LVerde=findViewById(R.id.verde);
        LRojo=findViewById(R.id.rojo);

        Rojos.add(getResources().getColor(R.color.color_rojo1));
        Rojos.add(getResources().getColor(R.color.color_rojo2));
        Rojos.add(getResources().getColor(R.color.color_rojo3));
        Rojos.add(getResources().getColor(R.color.color_rojo4));
        Rojos.add(getResources().getColor(R.color.color_rojo5));
        Rojos.add(getResources().getColor(R.color.color_rojo6));

        Azul.add(getResources().getColor(R.color.color_azul1));
        Azul.add(getResources().getColor(R.color.color_azul2));
        Azul.add(getResources().getColor(R.color.color_azul3));
        Azul.add(getResources().getColor(R.color.color_azul4));
        Azul.add(getResources().getColor(R.color.color_azul5));
        Azul.add(getResources().getColor(R.color.color_azul6));

        Verde.add(getResources().getColor(R.color.color_verde1));
        Verde.add(getResources().getColor(R.color.color_verde2));
        Verde.add(getResources().getColor(R.color.color_verde3));
        Verde.add(getResources().getColor(R.color.color_verde4));
        Verde.add(getResources().getColor(R.color.color_verde5));
        Verde.add(getResources().getColor(R.color.color_verde6));



        LRojo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                aux=(int)(Math.random()*6)+1;
                color=Rojos.get(aux);
                LRojo.setBackgroundColor(color);
                aux=0;
            }
        });
        LAzul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                aux=(int)(Math.random()*6)+1;
                color=Azul.get(aux);
                LAzul.setBackgroundColor(color);
                aux=0;
            }
        });
        LVerde.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                aux=(int)(Math.random()*6)+1;
                color=Verde.get(aux);
                LVerde.setBackgroundColor(color);
                aux=0;
            }
        });
    }
}
