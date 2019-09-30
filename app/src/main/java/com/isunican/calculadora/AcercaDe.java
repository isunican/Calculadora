package com.isunican.calculadora;

import android.content.Intent;
import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_acercade);

    }

    //===================================
    // Menu de la aplicacion (action bar)
    // ===================================
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Carga los items al action bar
        getMenuInflater().inflate(R.menu.navigation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Maneja los clicks a los items del action bar
        // Los clicks a los botones inicio y atras se manejan automaticamente
        // segun la actividad que hayamos definido como padre en el AndroidManifest.xml.
        int id = item.getItemId();
        Intent intent = null;

        switch(id){
            case R.id.navigation_simple:
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.navigation_acercade:
                intent = new Intent(this, AcercaDe.class);
                startActivity(intent);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

}