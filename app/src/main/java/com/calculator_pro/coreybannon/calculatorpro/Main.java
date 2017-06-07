package com.calculator_pro.coreybannon.calculatorpro;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {
    private double val;
    private double val2;
    private char action = ' ';
    private double sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        //Calling Calculations class
        final Calculations calculations = new Calculations();

        //Initialising buttons
        final Button one = (Button) findViewById(R.id.button_one);
        final Button two = (Button) findViewById(R.id.button_two);
        final Button three = (Button) findViewById(R.id.button_three);
        final Button four = (Button) findViewById(R.id.button_four);
        final Button five = (Button) findViewById(R.id.button_five);
        final Button six = (Button) findViewById(R.id.button_six);
        final Button seven = (Button) findViewById(R.id.button_seven);
        final Button eight = (Button) findViewById(R.id.button_eight);
        final Button nine = (Button) findViewById(R.id.button_nine);
        final Button zero = (Button) findViewById(R.id.button_zero);
        final Button dot = (Button) findViewById(R.id.button_dot);
        final Button equals = (Button) findViewById(R.id.button_equals);
        final Button c = (Button) findViewById(R.id.button_c);
        final Button divide = (Button) findViewById(R.id.button_divide);
        final Button multiply = (Button) findViewById(R.id.button_multiply);
        final Button minus = (Button) findViewById(R.id.button_minus);
        final Button plus = (Button) findViewById(R.id.button_plus);
        final TextView textview = (TextView) findViewById(R.id.textView);

        //button one click functionality
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "1");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "2");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "3");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "4");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "5");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "6");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "7");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "8");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "9");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //button two click functionality
        zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(textview.getText() + "0");
                val = Double.parseDouble(textview.getText().toString());
            }
        });

        //Work in progress
        /*//button two click functionality
        dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(current_val += ".");
            }}
        );*/

        //button zero click functionality
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText("");
                action = ' ';
                val2 = 0;
                val = 0;
            }}
        );

        //button equals click functionality
        equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sum = calculations.equals(val,val2,action);
                if ((sum == Math.floor(sum)) && !Double.isInfinite(sum)) {
                    textview.setText(String.valueOf((int)sum));
                }else {
                    textview.setText(String.valueOf(sum));
                }
                val2 = sum;
                action = ' ';
                val = 0;
            }}
        );

        //button two click functionality
        divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                action = '/';
                if(val2 == 0)
                    val2 = val;
                else
                    calculations.equals(val,val2,action);
                textview.setText(null);
                val = 0;
            }}
        );

        multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                action = 'x';
                if(val2 == 0)
                    val2 = val;
                else
                    calculations.equals(val,val2,action);
                textview.setText(null);
                val = 0;
            }}
        );

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                action = '-';
                if(val2 == 0)
                    val2 = val;
                else
                    calculations.equals(val,val2,action);
                textview.setText(null);
                val = 0;
            }}
        );

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                action = '+';
                if(val2 == 0)
                    val2 = val;
                else
                    calculations.equals(val,val2,action);
                textview.setText(null);
                val = 0;
            }}

        );

    }
}
