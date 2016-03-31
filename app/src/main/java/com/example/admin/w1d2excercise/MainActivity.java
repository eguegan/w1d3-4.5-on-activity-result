package com.example.admin.w1d2excercise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String extra = intent.getStringExtra("result");
        Log.d("TAG_", "onCreate: " + extra);
//        mTextView = (TextView) findViewById(R.id.am_text_1);
//        mTextView.setText(extra);
    }

    public void startSecondAct(View view){
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, 1);
    }
//
//    public void onActivityResult(){
//
//    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == 1){
            if(resultCode == 1){
                String result = data.getStringExtra("result");
                Log.d("TAG", "onActivityResult: " + result);
            }
        }
    }
}
