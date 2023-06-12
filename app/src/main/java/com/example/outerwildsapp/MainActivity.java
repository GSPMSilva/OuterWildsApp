package com.example.outerwildsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    public void IrPlanetas (View view){
        Intent intent = new Intent(this, TelaPlanetas.class);
        startActivity(intent);

    }
    public void IrPersonagem (View view){
        Intent intent = new Intent(this, TelaPersonagem.class);
        startActivity(intent);

    }
    public void IrHistoria (View view){
        Intent intent = new Intent(this, TelaHistoria.class);
        startActivity(intent);

    }
    public void IrSteam (View view){
        Intent intent = new Intent(this, TelaSteam.class);
        startActivity(intent);

    }
}
