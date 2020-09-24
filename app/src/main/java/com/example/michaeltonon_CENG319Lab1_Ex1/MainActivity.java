package com.example.michaeltonon_CENG319Lab1_Ex1;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    String tag = "Lifecycle";
    private BottomFragment fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        fragment.displayCreate();
        Log.d(tag, "In the onCreate() event");
    }

    @Override
    public void onStart() {
        super.onStart();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        fragment.displayStart();
        Log.d(tag, "In the onStart() event");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        fragment.displayRestart();
        Log.d(tag, "In the onRestart() event");
    }

    @Override
    public void onResume() {
        super.onResume();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        fragment.displayResume();
        Log.d(tag, "In the onResume() event");
    }

    @Override
    public void onPause() {
        super.onPause();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        fragment.displayPause();
        Log.d(tag, "In the onPause() event");
    }

    @Override
    public void onStop() {
        super.onStop();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        fragment.displayStop();
        Log.d(tag, "In the onStop() event");
    }

    @Override
    public void onDestroy() {
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        fragment.displayDestroy();
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }

}