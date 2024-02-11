package com.joaolima.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSoma = (Button)findViewById(R.id.botaoSoma);
        Button btnSubtrair = (Button)findViewById(R.id.botaoSubtracao);
        Button btnSMultiplicar = (Button)findViewById(R.id.botaoMultiplicacao);
        Button btnDividir = (Button)findViewById(R.id.botaoDivisao);
    }
}