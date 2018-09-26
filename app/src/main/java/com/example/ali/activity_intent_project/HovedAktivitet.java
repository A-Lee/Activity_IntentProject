package com.example.ali.activity_intent_project;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class HovedAktivitet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoved_aktivitet);

        Button nextPage = (Button) findViewById(R.id.nextPage);
        Button googleSearch = (Button) findViewById(R.id.googleSearch);

        nextPage.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), Side2.class);
                intent.putExtra("InfoForNextPage", "Welcome back to android developement, Ali");
                startActivity(intent);
            }
        });

        googleSearch.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String google = "http://www.wololo.net";
                Uri webAdress = Uri.parse(google);
                Intent intent = new Intent(Intent.ACTION_VIEW, webAdress);
                if(intent.resolveActivity(getPackageManager()) != null)
                {
                    startActivity(intent);
                }
            }
        });
    }
}
