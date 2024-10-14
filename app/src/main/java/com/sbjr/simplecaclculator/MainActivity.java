package com.sbjr.simplecaclculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    Button btn1,btn2,btn3,btn4,btn6,btn7,btn8,btn9,btnDivide,btnMultiply,btn5,btnAC,btn0,btnMinus,btnBack,btnDot,btnEquals,btnPlus;
    private double num1, num2, result;
    private String operator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initListners();
    }
        public void initViews() {
            editText = findViewById(R.id.editText);

             btn7 = findViewById(R.id.btn7);
             btn8 = findViewById(R.id.btn8);
             btn9 = findViewById(R.id.btn9);
             btnDivide = findViewById(R.id.btnDivide);

             btn4 = findViewById(R.id.btn4);
             btn5 = findViewById(R.id.btn5);
             btn6 = findViewById(R.id.btn6);
             btnMultiply = findViewById(R.id.btnMultiply);

             btn1 = findViewById(R.id.btn1);
             btn2 = findViewById(R.id.btn2);
             btn3 = findViewById(R.id.btn3);
             btnMinus = findViewById(R.id.btnMinus);

             btn0 = findViewById(R.id.btn0);
             btnBack = findViewById(R.id.btnBack);
              btnAC = findViewById(R.id.btnC);
             btnDot = findViewById(R.id.btnDot);
             btnEquals = findViewById(R.id.btnEquals);
             btnPlus = findViewById(R.id.btnPlus);

        }


        public void initListners(){

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "9");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(editText.getText().toString());
                operator = "/";
                editText.setText("");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "6");
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(editText.getText().toString());
                operator = "*";
                editText.setText("");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "3");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(editText.getText().toString());
                operator = "-";
                editText.setText("");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + ".");
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Double.parseDouble(editText.getText().toString());
                if (operator.equals("+")) {
                    result = num1 + num2;
                } else if (operator.equals("-")) {
                    result = num1 - num2;
                } else if (operator.equals("*")) {
                    result = num1 * num2;
                } else if (operator.equals("/")) {
                    result = num1 / num2;
                }
                editText.setText(String.valueOf(result));
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Double.parseDouble(editText.getText().toString());
                operator = "+";
                editText.setText("");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.getText().clear();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}