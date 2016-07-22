package br.com.schelb.fernando.pratiquesolfejo;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ScrollTextView scrolltext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/MusiQwik-Bold.ttf");
        final ScrollTextView scrolltext = (ScrollTextView) findViewById(R.id.scrolltext);


        scrolltext.setText("&2=T=T=='");
        scrolltext.setTypeface(myCustomFont);
        scrolltext.setTextColor(Color.BLACK);
        scrolltext.pauseScroll();

        Button btStart = (Button) findViewById(R.id.btStart);

        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrolltext.startScroll();
            }
        });

        Button btPause = (Button)findViewById(R.id.btPause);

        btPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrolltext.pauseScroll();
            }
        });

        Button btResume = (Button)findViewById(R.id.btResume);

        btResume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scrolltext.resumeScroll();
            }
        });

    }

}
