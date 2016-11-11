package com.marcomacias.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends AppCompatActivity {

    public double V1, V2;
    public EditText qV1, qV2;
    public TextView Resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        qV1 = (EditText) findViewById(R.id.editText5);
        qV2 = (EditText) findViewById(R.id.editText6);
        Resultado = (TextView) findViewById(R.id.textView2);

    }
    public void SUMA(View view){
        V1 = Double.parseDouble(qV1.getText().toString());
        V2 = Double.parseDouble(qV2.getText().toString());
        Resultado.setText(Double.toString(V1+V2));

    }
    public void RESTA(View view){
        V1 = Double.parseDouble(qV1.getText().toString());
        V2 = Double.parseDouble(qV2.getText().toString());
        Resultado.setText(Double.toString(V1-V2));
    }
    public void MULTIPLICACION(View view){
        V1 = Double.parseDouble(qV1.getText().toString());
        V2 = Double.parseDouble(qV2.getText().toString());
        Resultado.setText(Double.toString(V1*V2));
    }
    public void DIVISION(View view){
        V1 = Double.parseDouble(qV1.getText().toString());
        V2 = Double.parseDouble(qV2.getText().toString());
        Resultado.setText(Double.toString(V1/V2));
    }
}
