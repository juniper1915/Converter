package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textCelsius = findViewById(R.id.celsius_edit);
        EditText textFahrenheit = findViewById(R.id.fahrenheit_edit);
        Button buttonConvert = findViewById(R.id.button_convert);
        Button buttonClear = findViewById(R.id.button_clear);



        buttonConvert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if(textCelsius.getText().toString().trim().length() > 0){
                  double celsius = Double.valueOf( textCelsius.getText().toString());
                  double fahrenheit = (celsius * 1.8) + 32;
                  textFahrenheit.setText(String.valueOf(fahrenheit));
                }
                else if(textFahrenheit.getText().toString().trim().length() > 0) {
                    double fahrenheit = Double.valueOf( textFahrenheit.getText().toString());
                    double celsius = (fahrenheit - 32) / 1.8;
                    textCelsius.setText(String.valueOf(celsius));

                }
                else { Toast.makeText(MainActivity.this,
                        "Values cannot be empty", Toast.LENGTH_LONG).show();
                }
                }


        });
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textFahrenheit.setText("");
                textCelsius.setText("");
            }
        });
        }
        }



