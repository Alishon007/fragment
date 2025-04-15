package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentEjemploActivity extends Fragment {
    private TextView textViewMensaje;
    private Button botonCambiarTexto;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el layout para este fragment
        View view = inflater.inflate(R.layout.fragment_ejemplo, container, false);
        textViewMensaje = view.findViewById(R.id.textViewMensaje);
        botonCambiarTexto = view.findViewById(R.id.botonCambiarTexto);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        botonCambiarTexto.setOnClickListener(v -> {
            textViewMensaje.setText("Texto cambiado desde el Fragment!");
        });
    }

    // Otros métodos del ciclo de vida pueden ser implementados aquí
}