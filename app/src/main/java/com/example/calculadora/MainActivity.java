package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //declarar variables globales para los controles
    EditText etNro1, etNro2, etResultado;
    Button btnSumar, btnRestar, btnMultiplicar,btnDividir,btnSalir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //escuchar los controles de la vista
        etNro1 = (EditText) findViewById(R.id.etNro1);
        etNro2 = (EditText) findViewById(R.id.etNro2);
        etResultado = (EditText) findViewById(R.id.etResultado);
        btnSumar = (Button) findViewById(R.id.btnSumar);
        btnRestar = (Button) findViewById(R.id.btnRestar);
        btnMultiplicar = (Button) findViewById(R.id.btnMultiplicar);
        btnDividir = (Button) findViewById(R.id.btnDividir);

        //proceso de evento
        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sumar();
            }
        });
       btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dividir();
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Multiplciar();
            }
        });

        btnRestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restar();
            }
        });


    }



    private void Restar() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double restar = nro1 - nro2;
        etResultado.setText(String.valueOf(restar));
    }



    private void Multiplciar() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double multiplicar = nro1 * nro2;
        etResultado.setText(String.valueOf(multiplicar));

    }

    private void Dividir() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        if(nro2 == 0)
        {
            etResultado.setText("Error: division entre 0 no valida");
        }else {
            double Division = nro1/nro2;
            etResultado.setText(String.valueOf(Division));
        }
    }
    private void Sumar() {
        double nro1 = Double.valueOf(etNro1.getText().toString());
        double nro2 = Double.valueOf(etNro2.getText().toString());
        double suma = nro1 + nro2;
        etResultado.setText(String.valueOf(suma));

    }
}