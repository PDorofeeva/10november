package com.example.a10november;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private int counter;
    private TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("AAAA", "onCreate");
        btn = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        btn.setOnClickListener(view -> {
            counter++;
            tv.setText(Integer.toString(counter));
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) { //Сохранение данных
        super.onSaveInstanceState(outState);
        outState.putInt("value", counter);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) { //Востановление данных
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("value");
        tv.setText(Integer.toString(counter));
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("AAAA", "onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("AAAA", "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("AAAA", "onDestroy");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("AAAA", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("AAAA", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("AAAA", "onRestart");
    }
}