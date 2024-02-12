package com.joaolima.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    double numberFirst, numberSecond, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSoma = (Button)findViewById(R.id.botaoSoma);
        Button btnSubtrair = (Button)findViewById(R.id.botaoSubtracao);
        Button btnSMultiplicar = (Button)findViewById(R.id.botaoMultiplicacao);
        Button btnDividir = (Button)findViewById(R.id.botaoDivisao);

        TextView resultado = (TextView)findViewById(R.id.resultado);
        EditText firstNumber = (EditText)findViewById(R.id.inputPrimeiroValor);
        EditText secondNumber = (EditText)findViewById(R.id.inputSegundoValor);

        numberFirst = Double.parseDouble(firstNumber.getText().toString());
        numberSecond = Double.parseDouble(secondNumber.getText().toString());

        btnSoma.setOnClickListener(new OnClickListener(){
           public  void onClick(view v){
               result = numberFirst + numberSecond;
               resultado.setText((String.valueOf(result)));
           }
        });

        btnSubtrair.setOnClickListener(new OnClickListener(){
            public  void onClick(view v){
                result = numberFirst - numberSecond;
                resultado.setText((String.valueOf(result)));
            }
        });

        btnSMultiplicar.setOnClickListener(new OnClickListener(){
            public  void onClick(view v){
                result = numberFirst * numberSecond;
                resultado.setText((String.valueOf(result)));
            }
        });

        btnDividir.setOnClickListener(new OnClickListener(){
            public  void onClick(view v){
                result = numberFirst / numberSecond;
                resultado.setText((String.valueOf(result)));
            }
        });
    }
}