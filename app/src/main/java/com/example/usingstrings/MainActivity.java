package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("Lifecycle", "Oncreate() invoked");

        txtView2 = findViewById(R.id.textView2);
        txtView2.setText(R.string.Msg2);



    }
    public void onStart()
    {
        super.onStart();
        Log.i ( "Lifecycle", "OnStart() invoked");

    }
    public void onRestart()
    {
        super.onRestart();
        Log.i ( "Lifecycle", "OnRestart() invoked");

    }
    public void onResume()
    {
        super.onResume();
        Log.i ( "Lifecycle", "OnResume() invoked");

    }

}