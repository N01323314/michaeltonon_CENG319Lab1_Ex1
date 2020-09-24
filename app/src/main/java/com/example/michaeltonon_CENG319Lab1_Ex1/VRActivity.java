package com.example.michaeltonon_CENG319Lab1_Ex1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class VRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vr_activity);
        TextView textView = findViewById(R.id.cyclesvractive);
        String msg = getString(R.string.create);
        textView.setText(msg + "\n");
    }

    @Override
    public void onStart() {
        super.onStart();
        TextView textView = findViewById(R.id.cyclesvractive);
        String msg = getString(R.string.start);
        textView.append(msg + "\n");
    }

    @Override
    public void onRestart() {
        super.onRestart();
        TextView textView = findViewById(R.id.cyclesvractive);
        String msg = getString(R.string.restart);
        textView.setText(msg + "\n");
    }

    @Override
    public void onResume() {
        super.onResume();
        TextView textView = findViewById(R.id.cyclesvractive);
        String msg = getString(R.string.resume);
        textView.append(msg + "\n");
    }

    @Override
    public void onPause() {
        super.onPause();
        TextView textView = findViewById(R.id.cyclesvractive);
        String msg = getString(R.string.pause);
        textView.setText(msg + "\n");
        textView = findViewById(R.id.cyclesvractive);
    }

    @Override
    public void onStop() {
        super.onStop();
        TextView textView = findViewById(R.id.cyclesvractive);
        String msg = getString(R.string.stop);
        textView.append(msg + "\n");
    }

    @Override
    public void onDestroy() {
        String msg = getString(R.string.destroy);
        TextView textView = findViewById(R.id.cyclesvractive);
        textView.append(msg + "\n");
        super.onDestroy();
    }
}