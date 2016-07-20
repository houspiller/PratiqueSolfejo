package br.com.schelb.fernando.pratiquesolfejo;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.textoviewID);
        Typeface myCustomFont = Typeface.createFromAsset(getAssets(),"fonts/MusiQwik-Bold.ttf");
        tv.setTypeface(myCustomFont);


        ScrollTextView scrolltext=(ScrollTextView) findViewById(R.id.scrolltext);

        scrolltext.setText("abcjkshsksjsjfksdhfkjadhfldjhfakljfhjsdhfkljadhflkashfkljdshflkas");
        scrolltext.setTextColor(Color.BLACK);
        scrolltext.startScroll();

    }
}
