package com.example.truegg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private EditText FoodName, calories;
    private Button submit;
    private DBHandler dba;
    private Button ViewButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        ViewButton = findViewById(R.id.ViewButton);
        FoodName = findViewById(R.id.CaloriesFood);
        calories = findViewById(R.id.caloriesNum);
        submit = findViewById(R.id.submitButton);

       // submit.setOnClickListener(v -> saveDataTODB());

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String food1 = FoodName.getText().toString();
                String cal = calories.getText().toString();

               Toast.makeText(getApplicationContext(), food1 + cal, Toast.LENGTH_LONG)
                       .show();
           }
      });

        int FoodName = R.string.calories;
        Intent sendMessage = new Intent(MainActivity.this, Details.class);
        sendMessage.putExtra("calories", FoodName);


       ViewButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity( new Intent(MainActivity.this, Details.class));

           }
       });

    }

    private void saveDataTODB() {

        Foods foods = new Foods();
        String name = FoodName.getText().toString();
        String cal = calories.getText().toString();


        try {
            int calInt = Integer.parseInt(cal);
        }catch(NumberFormatException ex){

        }




        if (name.equals("")&& cal.equals("")) {


            Toast.makeText(getApplicationContext(), "Please enter some values", Toast.LENGTH_LONG)
                    .show();
        }else{
            foods.setFoodName(name);
        //    foods.setCalories(calInt);

            dba.addFood(foods);




            FoodName.setText("");
            calories.setText("");

          //  Toast.makeText(getApplicationContext(), "food" + foods + "calories" + calInt, Toast.LENGTH_LONG).show();

            dba.close();

        }
    }

}