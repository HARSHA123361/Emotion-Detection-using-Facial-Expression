package com.example.imd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class suprise extends AppCompatActivity {
    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suprise);

        imgbutton = (ImageButton) findViewById(R.id.imageButton12);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(suprise.this,MainActivity4.class);
                startActivity(intent);
            }
        });

        imgbutton = (ImageButton) findViewById(R.id.imageButton14);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(suprise.this,MainActivity5.class);
                startActivity(intent);
            }
        });
    }
}