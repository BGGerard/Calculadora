package com.example.bgera.mycalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText num1,num2;
    Button suma,resta,mult,div;
    TextView resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Asignacion de variables
        num1 = (EditText) findViewById(R.id.num1);
        num2 =(EditText) findViewById(R.id.num2);

        suma =(Button) findViewById(R.id.sumar);
        resta=(Button) findViewById(R.id.resta);
        mult =(Button) findViewById(R.id.mult);
        div=(Button) findViewById(R.id.div);

        resultado =(TextView) findViewById(R.id.resultado);
//Implementacion de un evento
        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        mult.setOnClickListener(this);
        div.setOnClickListener(this);
    }

    @Override 
    public void onClick(View v) {
        String n1 = num1.getText().toString();//Se ocupa para pasar el texto string del edittext a int
        String n2 = num2.getText().toString();

        int entero1=Integer.parseInt(n1);//variables ya int de numb1
        int entero2=Integer.parseInt(n2);

        int rt=0;//Simple variable

        switch (v.getId()){
            case R.id.sumar:
                rt=entero1+entero2;
                break;
            case R.id.resta:
                rt=entero1-entero2;
                break;
            case R.id.mult:
                rt=entero1*entero2;
                break;
            case R.id.div:
                rt=entero1/entero2;
                break;
        }

        resultado.setText(""+rt);//se oucupa la concatenacion para poder imprimir el entero en un TextView

    }
}
