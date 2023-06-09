package com.example.probando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText txtNombre, txtEmail, txtDomicilio;
    Button btnGuardar;
    Spinner cbxDeptos;
    RadioButton rbCompleto, rbMedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtEmail = findViewById(R.id.editTextTextEmailAddress);
        txtDomicilio = findViewById(R.id.textView);
        txtNombre = findViewById(R.id.txtNombre);
        txtNombre = findViewById(R.id.txtNombre);
        txtNombre = findViewById(R.id.txtNombre);
        txtNombre = findViewById(R.id.txtNombre);

    }
}