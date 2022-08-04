package com.example.truegg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Details extends AppCompatActivity {

    private TextView date;
    private TextView food;
    private TextView calories;
    private TextView count;
    private Button HomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);



        date = findViewById(R.id.dateText);
        food = findViewById(R.id.name);
        calories = findViewById(R.id.calories);
        count = findViewById(R.id.caloriesNum);
        HomeButton = findViewById(R.id.HomeButton);


       // HomeButton.setOnClickListener(new View.OnClickListener() {
         //   @Override
       //     public void onClick(View view) {
              //  startActivity( new Intent(Details.this, MainActivity.class));

      //      }
     //   });












    }
}