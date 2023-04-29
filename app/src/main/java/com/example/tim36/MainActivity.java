package com.example.tim36;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    private Button buttonPrijava;
    private Button buttonRegistracija;
    private Button buttonGost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPrijava = (Button) findViewById(R.id.buttonPrijava);
        buttonPrijava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPrijava();
            }
        });
    }

    public void openPrijava() {
        Intent intent = new Intent(this, PrijavaActivity.class);
        startActivity(intent);
    }
}