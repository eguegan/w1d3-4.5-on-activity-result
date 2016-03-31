package com.example.admin.w1d2excercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void returnToFirstAct(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("result", "Button 1");
        setResult(1, intent);
        finish();
    }

    public void returnToFirstAct2(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("result", "Button 2");
        setResult(1, intent);
        finish();
    }
    public void returnToFirstAct3(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("result", "Button 3");
        setResult(1, intent);
        finish();
    }
}
