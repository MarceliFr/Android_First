package com.example.marcel.first;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView wynik;
    EditText liczba1, liczba2;
    Button suma, roznica, iloczyn, iloraz;

    float wynikOs;
    int l1, l2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                }
            }
        );
        wynik = (TextView)findViewById(R.id.wynik);
        liczba1 = (EditText)findViewById(R.id.liczba1);
        liczba2 = (EditText)findViewById(R.id.liczba2);

        suma = (Button)findViewById(R.id.Suma);
        roznica = (Button)findViewById(R.id.Roznica);
        iloczyn = (Button)findViewById(R.id.Iloczyn);
        iloraz = (Button)findViewById(R.id.Iloraz);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    public void dodaj(View view) {
        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        wynikOs = l1 + l2;
        wynik.setText(String.valueOf(wynikOs));
    }
    public void odejmij(View view) {
        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        wynikOs = l1 - l2;
        wynik.setText(String.valueOf(wynikOs));
    }
    public void pomnoz(View view) {
        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        wynikOs = l1 * l2;
        wynik.setText(String.valueOf(wynikOs));
    }
    public void podziel(View view) {
        l1 = Integer.parseInt(liczba1.getText().toString());
        l2 = Integer.parseInt(liczba2.getText().toString());
        wynikOs = l1 / l2;
        wynik.setText(String.valueOf(wynikOs));
    }
}
