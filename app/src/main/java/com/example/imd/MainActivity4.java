package com.example.imd;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity4 extends AppCompatActivity {
    private Button button;
    ImageButton imgbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
        imgbutton = (ImageButton) findViewById(R.id.profilebutton);
        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this,MainActivity3.class);
                startActivity(intent);
            }
        });


        imgbutton = (ImageButton) findViewById(R.id.imageButton5);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity4.this,"You are in home page",Toast.LENGTH_SHORT).show();
            }
        }));
        imgbutton = (ImageButton) findViewById(R.id.imageButton6);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(intent);
            }
        }));
        imgbutton = (ImageButton) findViewById(R.id.imageButton7);
        imgbutton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity4.this,MainActivity5.class);
                startActivity(intent);
            }
        }));
    }
    public void logout1(View view) {
        FirebaseAuth.getInstance() .signOut();
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        finish();
    }
}