package com.example.ali.activity_intent_project;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Side2 extends AppCompatActivity {

    private String info = "";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_side2);

        Button regKnapp = (Button) findViewById(R.id.Register);
        regKnapp.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                TextView firstName = (TextView) findViewById(R.id.firstName);
                TextView lastName = (TextView) findViewById(R.id.lastName);
                TextView adress = (TextView) findViewById(R.id.Adress);
                TextView age = (TextView) findViewById(R.id.Age);
                TextView phoneNumber = (TextView) findViewById(R.id.phoneNumber);

                if(firstName.getText().length() == 0 || lastName.getText().length() == 0 || adress.getText().length() == 0 ||
                        age.getText().length() == 0 || phoneNumber.getText().length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"You have to fill out every field", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent processingPage = new Intent(getApplicationContext(), processForm.class);
                    processingPage.putExtra("firstName", firstName.getText().toString());
                    processingPage.putExtra("lastName", lastName.getText().toString());
                    processingPage.putExtra("adress", adress.getText().toString());
                    processingPage.putExtra("age", Integer.valueOf(age.getText().toString()));
                    processingPage.putExtra("phoneNumber", Integer.valueOf(phoneNumber.getText().toString()));
                    startActivity(processingPage);
                }
            }
        });

    }
}
