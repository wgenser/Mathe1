package com.example.david_genser.mathe1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private int Zahl1, Zahl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView-Variablen erzeugen
        final TextView Anzeige1 =
                (TextView) findViewById(R.id.textView);
        final TextView Anzeige2 =
                (TextView) findViewById(R.id.textView2);
        final TextView Anzeige3 =
                (TextView) findViewById(R.id.textView3);

        //Button-Variablen erzeugen
        Button AddButton = (Button) findViewById(R.id.button);
        Button SubButton = (Button) findViewById(R.id.button2);
        Button MulButton = (Button) findViewById(R.id.button3);
        Button DivButton = (Button) findViewById(R.id.button4);
        Button NeuButton = (Button) findViewById(R.id.button5);


    }

}
