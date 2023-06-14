package com.example.outerwildsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.net.Uri;
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
        Intent intent1 = new Intent(this, TelaPlanetas.class);
        startActivity(intent1);

    }
    public void IrPersonagem (View view){
        Intent intent2 = new Intent(this, TelaPersonagem.class);
        startActivity(intent2);

    }
    public void IrSteam (View view){
        Uri link = Uri.parse("https://store.steampowered.com/app/753640/Outer_Wilds/");
        Intent intent3 = new Intent(Intent.ACTION_VIEW,link);
        startActivity(intent3);
    }
}
