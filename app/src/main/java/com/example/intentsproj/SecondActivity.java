package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    EditText editText1,editText2;
    String st1,st2;
    double no1,no2,ans;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        editText1 = (EditText) findViewById(R.id.editTextNumber1sec);
        st1 = intent.getStringExtra("firstNumber1");
        editText1.setText(st1);



        editText2 = (EditText) findViewById(R.id.editTextNumber2sec);
        st2 = intent.getStringExtra("firstNumber2");
        editText2.setText(st2);


       addDouble();
       subDouble();
       multDouble();
       divDouble();


    }

    public void addDouble(){


        button=(Button) findViewById(R.id.addButton);
        textView = (TextView) findViewById(R.id.textViewForAns);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                no1 = Double.parseDouble(editText1.getText().toString());
                no2 = Double.parseDouble(editText2.getText().toString());

                ans = no1 + no2;

                // set it ot result textview
                textView.setText(String.format("%.0f",no1)+ " + " + String.format("%.0f",no2) + " = " + String.format("%.0f",ans));
            }
        });


    }

    public void subDouble(){


        button=(Button) findViewById(R.id.subButton);
        textView = (TextView) findViewById(R.id.textViewForAns);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                no1 = Double.parseDouble(editText1.getText().toString());
                no2 = Double.parseDouble(editText2.getText().toString());

                ans = no1 - no2;

                // set it ot result textview
                textView.setText(String.format("%.0f",no1)+ " - " + String.format("%.0f",no2) + " = " + String.format("%.0f",ans));
            }
        });


    }


    public void multDouble(){


        button=(Button) findViewById(R.id.multiButton);
        textView = (TextView) findViewById(R.id.textViewForAns);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                no1 = Double.parseDouble(editText1.getText().toString());
                no2 = Double.parseDouble(editText2.getText().toString());

                ans = no1 * no2;

                // set it ot result textview
                textView.setText(String.format("%.0f",no1)+ " * " + String.format("%.0f",no2) + " = " + String.format("%.0f",ans));
            }
        });


    }


    public void divDouble(){


        button=(Button) findViewById(R.id.divButton);
        textView = (TextView) findViewById(R.id.textViewForAns);

        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                no1 = Double.parseDouble(st1);
                no2 = Double.parseDouble(st2);

                ans = no1 / no2;

                // set it ot result textview
                textView.setText(String.format("%.0f",no1)+ " / " + String.format("%.0f",no2) + " = " + String.format("%.2f",ans));
            }
        });


    }




}