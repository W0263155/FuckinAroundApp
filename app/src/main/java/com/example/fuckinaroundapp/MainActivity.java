package com.example.fuckinaroundapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MediaPlayer song = MediaPlayer.create(MainActivity.this,R.raw.bit_song);
        song.start();
        song.setLooping(true);

        final MediaPlayer soundEffect = MediaPlayer.create(MainActivity.this,R.raw.stupid);
        Button playStupid = this.findViewById(R.id.button3);
        playStupid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundEffect.start();
            }
        });
    }
}
