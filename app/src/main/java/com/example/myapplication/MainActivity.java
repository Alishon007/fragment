package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();

        // Crear una nueva instancia del Fragment
        FragmentEjemploActivity ejemploFragment = new FragmentEjemploActivity();

        // Comenzar una transacción para agregar el Fragment al contenedor
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.contenedor_fragment, ejemploFragment);
        transaction.commit(); // O transaction.commitNow() para ejecutar la transacción inmediatamente
    }
}