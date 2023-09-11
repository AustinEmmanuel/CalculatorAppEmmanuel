package com.example.calculatorappemmanuel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add(View v){
        EditText num1 = findViewById(R.id.num_One);
        double num1D = Double.parseDouble(num1.getText().toString());
        EditText num2 = findViewById(R.id.num_Two);
        double num2D = Double.parseDouble(num2.getText().toString());

        EditText answer = findViewById(R.id.num_answer);
        String answerValue = String.valueOf((num1D+num2D));
        answer.setText(answerValue);
    }

    public void subtract(View v){
        EditText num1 = findViewById(R.id.num_One);
        double num1D = Double.parseDouble(num1.getText().toString());
        EditText num2 = findViewById(R.id.num_Two);
        double num2D = Double.parseDouble(num2.getText().toString());

        EditText answer = findViewById(R.id.num_answer);
        String answerValue = String.valueOf((num1D-num2D));
        answer.setText(answerValue);
    }

    public void multiply(View v){
        EditText num1 = findViewById(R.id.num_One);
        double num1D = Double.parseDouble(num1.getText().toString());
        EditText num2 = findViewById(R.id.num_Two);
        double num2D = Double.parseDouble(num2.getText().toString());

        EditText answer = findViewById(R.id.num_answer);
        String answerValue = String.valueOf((num1D*num2D));
        answer.setText(answerValue);
    }

    public void division(View v){
        EditText num1 = findViewById(R.id.num_One);
        double num1D = Double.parseDouble(num1.getText().toString());
        EditText num2 = findViewById(R.id.num_Two);
        double num2D = Double.parseDouble(num2.getText().toString());

        EditText answer = findViewById(R.id.num_answer);
        String answerValue = String.valueOf((num1D/num2D));
        answer.setText(answerValue);
    }
}