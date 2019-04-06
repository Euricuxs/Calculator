package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button add;
    private Button subtract;
    private Button multiply;
    private Button divide;
    private Button equal;
    private Button clear;
    private TextView result;
    private double val1;
    private double val2;
    boolean addition;
    boolean subtraction;
    boolean multiplication;
    boolean division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "2");
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.setText(result.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(result.getText() + "");
                addition = true;
                result.setText(null);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(result.getText() + "");
                subtraction = true;
                result.setText(null);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(result.getText() + "");
                multiplication = true;
                result.setText(null);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(result.getText() + "");
                division = true;
                result.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val2 = Double.parseDouble(result.getText() + "");
                if(addition == true)
                {
                    result.setText(val1 + val2 + "");
                    addition = false;
                }
                else if(subtraction == true)
                {
                    result.setText(val1 - val2 + "");
                    subtraction = false;
                }
                else if(multiplication == true)
                {
                    result.setText(val1 * val2 + "");
                    multiplication = false;
                }
                else if(division == true) {
                    result.setText(val1 / val2 + "");
                    division = false;
                }
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.NaN;
                val2 = 0;
                result.setText(null);
            }
        });
    }

    private void setupUIViews() {

        zero        = (Button) findViewById(R.id.btn0);
        one         = (Button) findViewById(R.id.btn1);
        two         = (Button) findViewById(R.id.btn2);
        three       = (Button) findViewById(R.id.btn3);
        four        = (Button) findViewById(R.id.btn4);
        five        = (Button) findViewById(R.id.btn5);
        six         = (Button) findViewById(R.id.btn6);
        seven       = (Button) findViewById(R.id.btn7);
        eight       = (Button) findViewById(R.id.btn8);
        nine        = (Button) findViewById(R.id.btn9);
        equal       = (Button) findViewById(R.id.btnequal);
        clear       = (Button) findViewById(R.id.btnclear);
        add         = (Button) findViewById(R.id.btnadd);
        subtract    = (Button) findViewById(R.id.btnsub);
        multiply    = (Button) findViewById(R.id.btnmulti);
        divide      = (Button) findViewById(R.id.btndiv);
        result      = (TextView) findViewById(R.id.tvResult);
    }


}