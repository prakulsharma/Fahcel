package com.example.fahcel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import javax.crypto.NullCipher;


public class MainActivity extends AppCompatActivity {


    public void clickConvert(View view) {

        EditText fahrenheit = (EditText) findViewById(R.id.fah);
        EditText celsius = (EditText) findViewById(R.id.cel);

        String f = fahrenheit.getText().toString();
        String c = celsius.getText().toString();

        if(f.matches("") && c.matches("")){
            Toast.makeText(this, "It can't be empty.", Toast.LENGTH_SHORT).show();
        }
        else if (f.matches("")) {
            Double celDouble = Double.parseDouble(c);
            Double fahDouble = (celDouble * 1.8) + 32;
          //  Toast.makeText(this, celDouble.toString()+"C is " + fahDouble.toString() + "F", Toast.LENGTH_SHORT).show();
          //  celsius.getText().clear();
            fahrenheit.setText(String.format("%.2f",fahDouble));
        }
        else if (c.matches("")) {
            Double fahDouble = Double.parseDouble(f);
            Double celDouble = (fahDouble - 32)/1.8;
          //  Toast.makeText(this, fahDouble.toString()+"F is " + celDouble.toString() + "C", Toast.LENGTH_SHORT).show();
          //  fahrenheit.getText().clear();
            celsius.setText(String.format("%.2f",celDouble));
        }
        else {
                Toast.makeText(this, "Enter in only one field", Toast.LENGTH_SHORT).show();
        }
    }

    public void resetButton(View view) {
        EditText fahrenheit = (EditText) findViewById(R.id.fah);
        EditText celsius = (EditText) findViewById(R.id.cel);

        fahrenheit.getText().clear();
        celsius.getText().clear();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
