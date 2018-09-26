package com.example.ali.activity_intent_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class processForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_form);
        if(getIntent().hasExtra("firstName"))
        {
            String firstName,lastName,adress;
            int age,phoneNumber;

            firstName = getIntent().getExtras().getString("firstName");
            lastName = getIntent().getExtras().getString("lastName");
            adress = getIntent().getExtras().getString("adress");
            age = getIntent().getExtras().getInt("age");
            phoneNumber = getIntent().getExtras().getInt("phoneNumber");

            Person person = new Person(firstName,lastName,adress, age,phoneNumber);
            TextView textFelt = findViewById(R.id.textFelt);
            textFelt.setText(person.getInfo());
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Content has NOT!! been passed", Toast.LENGTH_LONG).show();
        }
    }
}
