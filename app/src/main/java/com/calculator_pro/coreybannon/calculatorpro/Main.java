package com.calculator_pro.coreybannon.calculatorpro;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {
    private String current_val = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

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
                if(current_val.equals("0")){
                    textview.setText(current_val = "1");
                }else
                textview.setText(current_val += "1");
               /* if((current_val == Math.floor((current_val)) && !Double.isInfinite(current_val)) {
                }else{
                    textview.setText("" + current_val);
                }*/
            }
        });

        //button two click functionality
        two.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "2");
                }else
                textview.setText(current_val += "2");
            }
        });

        //button two click functionality
        three.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "3");
                }else
                textview.setText(current_val += "3");
            }
        });

        //button two click functionality
        four.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "4");
                }else
                textview.setText(current_val += "4");
            }
        });

        //button two click functionality
        five.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "5");
                }else
                textview.setText(current_val += "5");
            }
        });

        //button two click functionality
        six.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "6");
                }else
                textview.setText(current_val += "6");
            }
        });

        //button two click functionality
        seven.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "7");
                }else
                textview.setText(current_val += "7");
            }
        });

        //button two click functionality
        eight.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "8");
                }else
                textview.setText(current_val += "8");
            }
        });

        //button two click functionality
        nine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "9");
                }else
                textview.setText(current_val += "9");
            }
        });

        //button two click functionality
        zero.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(current_val.equals("0")){
                    textview.setText(current_val = "0");
                }else
                textview.setText(current_val += "0");
            }
        });

        //button two click functionality
        dot.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(current_val += ".");
            }}
        );

        //button two click functionality
        equals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(current_val += "=");
            }}
        );

        //button two click functionality
        c.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(current_val = "0");
            }}
        );

        //button two click functionality
        divide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(current_val += "/");
            }}
        );

        multiply.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(current_val += "x");
            }}
        );

        minus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(current_val += "-");
            }}
        );

        plus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textview.setText(current_val += "+");
            }}
        );

    }
}
