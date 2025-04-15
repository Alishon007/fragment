package com.example.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SegundoFragment extends Fragment {

    private TextView textViewSegundoMensaje;
    private String mensaje;

    // Método para crear una nueva instancia del Fragment con argumentos
    public static SegundoFragment newInstance(String mensaje) {
        SegundoFragment fragment = new SegundoFragment();
        Bundle args = new Bundle();
        args.putString("mensaje", mensaje);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mensaje = getArguments().getString("mensaje");
        } else {
            mensaje = "Mensaje predeterminado del Segundo Fragment";
        }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflar el layout para este fragment
        View view = inflater.inflate(R.layout.activity_segundo_fragment, container, false);
        textViewSegundoMensaje = view.findViewById(R.id.textViewSegundoMensaje);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textViewSegundoMensaje.setText(mensaje);
    }

    // Otros métodos del ciclo de vida pueden ser implementados aquí
}