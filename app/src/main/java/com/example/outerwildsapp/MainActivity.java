package com.example.outerwildsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;
    ImageButton play;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = findViewById(R.id.imageButtonPlay);



    }

    public void MusicaPlay (View view){
        /** Inicia musica e troca para imagem de pausa**/
        if(mediaPlayer == null ){
            mediaPlayer =  MediaPlayer.create(this,(R.raw.music_outer));

        }

        /** Caso esteja tocando uma musica e se clica o botão: pausa e troca imagem para o play
         * senão a toca **/
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
            play.setImageResource(R.drawable.img_play);
        }
        else{
            mediaPlayer.start();
            play.setImageResource(R.drawable.img_pause);
        }


        /** Quando a musica terminar para a musica e troca a imagem para o play**/
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mediaPlayer){
                mediaPlayer.stop();
                play.setImageResource(R.drawable.img_play);
            }
        });


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
