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

    private int Zahl1, Zahl2; // ist privat, aber gilt innerhalb der class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView-Variablen erzeugen
        final TextView Anzeige1 =
                (TextView) findViewById(R.id.textView);
        final TextView Anzeige2 =  // linke Zufallszahl
                (TextView) findViewById(R.id.textView2);
        final TextView Anzeige3 =  // rechte Zufallszahl
                (TextView) findViewById(R.id.textView3);

        //Button-Variablen erzeugen
        Button AddButton = (Button) findViewById(R.id.button);
        Button SubButton = (Button) findViewById(R.id.button2);
        Button MulButton = (Button) findViewById(R.id.button3);
        Button DivButton = (Button) findViewById(R.id.button4);
        Button NeuButton = (Button) findViewById(R.id.button5); // Neue Zufallszahlen erzeugen

        // Wenn Button gedrückt, dann zwei neue zuf.zahlen
        NeuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random Zufall =  new Random();
                Zahl1 = Zufall.nextInt(100)+1;
                Zahl2 = Zufall.nextInt(100)+1;
                Anzeige1.setText(R.string.Rechenart); // Ausgabe Rechenart?
                Anzeige2.setText(String.valueOf(Zahl1));
                Anzeige3.setText(String.valueOf(Zahl2));
            }
        });

        AddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Ergebnis = Zahl1 + Zahl2;
                Anzeige1.setText(String.valueOf(Ergebnis));
            }
        });

    }

}
