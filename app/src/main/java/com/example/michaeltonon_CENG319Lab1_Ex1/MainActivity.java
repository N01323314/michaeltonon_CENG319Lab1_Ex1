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
        boolean check = true;
        fragment.displayCreate(check);
        Log.d(tag, "In the onCreate() event");
    }

    @Override
    public void onStart() {
        super.onStart();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        boolean check = true;
        fragment.displayStart(check);
        Log.d(tag, "In the onStart() event");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        boolean check = true;
        fragment.displayRestart(check);
        Log.d(tag, "In the onRestart() event");
    }

    @Override
    public void onResume() {
        super.onResume();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        boolean check = true;
        fragment.displayResume(check);
        Log.d(tag, "In the onResume() event");
    }

    @Override
    public void onPause() {
        super.onPause();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        boolean check = true;
        fragment.displayPause(check);
        Log.d(tag, "In the onPause() event");
    }

    @Override
    public void onStop() {
        super.onStop();
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        boolean check = true;
        fragment.displayStop(check);
        Log.d(tag, "In the onStop() event");
    }

    @Override
    public void onDestroy() {
        fragment = (BottomFragment)getSupportFragmentManager().findFragmentById(R.id.bottomfragment);
        boolean check = true;
        fragment.displayDestroy(check);
        super.onDestroy();
        Log.d(tag, "In the onDestroy() event");
    }



}