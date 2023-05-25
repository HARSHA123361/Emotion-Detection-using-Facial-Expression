package com.example.imd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class happy extends AppCompatActivity {

    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_happy);

        imgbutton = (ImageButton) findViewById(R.id.imageButton12);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(happy.this,MainActivity4.class);
                startActivity(intent);
            }
        });

        imgbutton = (ImageButton) findViewById(R.id.imageButton14);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(happy.this,MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}