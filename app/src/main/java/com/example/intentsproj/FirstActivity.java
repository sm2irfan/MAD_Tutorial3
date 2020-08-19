package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button button;
    EditText editText1,editText2;
    Toast toast;
    String st1,st2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);







        OnClickButton();
    }



    public void OnClickButton(){


        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View view) {
                        Context context = getApplicationContext();
                        CharSequence text = "Navigating Activity 2";
                        int duration = Toast.LENGTH_SHORT;
                        toast = Toast.makeText(context, text, duration);
                        toast.setGravity(Gravity.CENTER_VERTICAL, 10,10);
                        toast.show();

                        editText1 = findViewById(R.id.editTextNumber1sec);
                        st1 = editText1.getText().toString();

                        editText2 = findViewById(R.id.editTextNumber2sec);
                        st2 = editText2.getText().toString();

                        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
                        intent.putExtra("firstNumber1", st1);
                        intent.putExtra("firstNumber2", st2);

                        startActivity(intent);
                    }
                }
        );
    }


}