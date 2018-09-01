package com.example.robot.lifeplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityCUsuario extends AppCompatActivity implements View.OnClickListener {
    Button Registro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Registro = (Button) findViewById(R.id.button2);
    }

    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        intent = new Intent(MainActivityCUsuario.this, MainActivity.class);
        startActivity(intent);

    }
}