package com.easy.jamexaoj.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etnumber1;
    private EditText etnumber2;
    private Button btPlus;
    private Button btMius;
    private Button btMultiply;
    private Button btDivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnumber1 = findViewById(R.id.etnumber1);
        etnumber2 = findViewById(R.id.etnumber2);
        btPlus = findViewById(R.id.btPlus);
        btMius = findViewById(R.id.btMius);
        btMultiply = findViewById(R.id.btMultiply);
        btDivide = findViewById(R.id.btDivide);

        btPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etnumber1.getText().toString());
                int number2 = Integer.parseInt(etnumber2.getText().toString());
                Plus(number1,number2);
            }
        });
        btMius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etnumber1.getText().toString());
                int number2 = Integer.parseInt(etnumber2.getText().toString());
                Mius(number1,number2);
            }
        });
        btMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etnumber1.getText().toString());
                int number2 = Integer.parseInt(etnumber2.getText().toString());
                Multiply(number1,number2);
            }
        });
        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(etnumber1.getText().toString());
                int number2 = Integer.parseInt(etnumber2.getText().toString());
                Divide(number1,number2);
            }
        });
    }

private int Plus(int number1,int number2){
    return number1 + number2;
}
private int Mius(int number1,int number2){
    return number1 - number2;
    }
private int Multiply(int number1,int number2){
    return number1 * number2;
    }
private int Divide(int number1,int number2){
    return number1 / number2;
    }
}
