package com.nrsmac.seabass;

import android.app.Activity;
import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends Activity {

    private View mView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        mView = findViewById(R.id.relativeLayout);

        setImmersive();

        final MediaPlayer trainPlayer = MediaPlayer.create(getApplicationContext(), R.raw.train);
        final MediaPlayer dogPlayer = MediaPlayer.create(getApplicationContext(), R.raw.dog);
        final MediaPlayer bookPlayer = MediaPlayer.create(getApplicationContext(), R.raw.book);

        final ImageButton trainButton = (ImageButton) findViewById(R.id.trainButton);
        final ImageButton dogButton = (ImageButton) findViewById(R.id.dogButton);
        final ImageButton bookButton = (ImageButton) findViewById(R.id.bookButton);


        View.OnClickListener trainListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setImmersive();
                trainPlayer.start();
            }
        };

        View.OnClickListener dogListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                setImmersive();
                dogPlayer.start();
            }
        };

        View.OnClickListener bookListener = new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                setImmersive();
                bookPlayer.start();
            }
        };

        trainButton.setOnClickListener(trainListener);
        dogButton.setOnClickListener(dogListener);
        bookButton.setOnClickListener(bookListener);

    }

    private void setImmersive() {
        mView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }


}
