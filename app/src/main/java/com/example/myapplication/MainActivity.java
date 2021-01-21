package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "map4:mainactivity";
    private int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doClick(View view) {
        TextView tv = findViewById(R.id.textView);
        if(tv != null) {
            tv.setText("Button pressed " + count++ + " times");
        }
        Log.d(TAG, "doClick: inside");
    }
}