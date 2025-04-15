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

        // Agregar el primer Fragment
        FragmentEjemploActivity primerFragment = new FragmentEjemploActivity();
        FragmentTransaction transaction1 = fragmentManager.beginTransaction();
        transaction1.add(R.id.contenedor_fragment_uno, primerFragment);
        transaction1.commit();

        // Agregar el segundo Fragment
        SegundoFragment segundoFragment = SegundoFragment.newInstance("¡Hola Alisonnn 💋!");
        FragmentTransaction transaction2 = fragmentManager.beginTransaction();
        transaction2.add(R.id.contenedor_fragment_dos, segundoFragment);
        transaction2.commit();
    }
}