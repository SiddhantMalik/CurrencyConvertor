package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();


        Button buttonname = (Button) findViewById(R.id.button);
        EditText edit = (EditText)findViewById(R.id.editTextNumber);

        buttonname.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String inr = String.valueOf(edit.getText());
//                Double newrupee = Double.parseDouble(inr);
//  double newrupee = Double.parseDouble(String.format("%.3f",Double.parseDouble(inr)));
                String dollar = String.valueOf(Double.parseDouble(String.format("%.3f",(Double.parseDouble(String.format("%.3f",Double.parseDouble(inr)))/70))));
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, dollar, duration);
                toast.show();
            }
        });


    }
}