package com.rogerestrad.practica003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText numero1,numero2;
    TextView resultado;
    float num1,num2,res;
    RadioButton rbsuma,rbresta,rbmulty,rbdivi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rbsuma = (RadioButton) findViewById(R.id.rbS);
        rbresta = (RadioButton) findViewById(R.id.rbR);
        rbmulty = (RadioButton) findViewById(R.id.rbM);
        rbdivi = (RadioButton) findViewById(R.id.rbD);
        numero1=(EditText)findViewById(R.id.editText1);
        numero2=(EditText)findViewById(R.id.editText2);
        resultado=(TextView)findViewById(R.id.textViewresultado);
       
    }

    public void Calcular (View v){
        num1 = Float.parseFloat(numero1.getText().toString());
        num2 = Float.parseFloat(numero2.getText().toString());

        if(rbsuma.isChecked())
            res = num1 + num2;
        if(rbresta.isChecked())
            res = num1 - num2;
        if(rbmulty.isChecked())
            res = num1 + num2;
        if(rbdivi.isChecked())
            res = num1 + num2;
        resultado.setText(Float.toString(res));

    }

}
