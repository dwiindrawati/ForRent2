package com.example.ins.forrent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnsignin, btnsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsignin= (Button)findViewById(R.id.signin);
        btnsignup= (Button)findViewById(R.id.signup);
        TextView txtSlogan= (TextView)findViewById(R.id.slogan);

        btnsignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });

        btnsignin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

            }
        });
    }
}
