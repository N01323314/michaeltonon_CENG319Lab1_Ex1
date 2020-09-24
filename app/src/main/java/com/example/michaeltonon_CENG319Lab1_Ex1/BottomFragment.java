package com.example.michaeltonon_CENG319Lab1_Ex1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


public class BottomFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        String msg;
        msg = getString(R.string.createView) + getString(R.string.bottomToast);
        Toast.makeText(getContext(), msg, Toast.LENGTH_LONG).show();
        return view;
    }

    @Override
    public void onStart(){
        super.onStart();
        String msg;
        msg = getString(R.string.start) + getString(R.string.bottomToast);
        Toast.makeText(getContext(), msg, Toast.LENGTH_LONG).show();
    }

    public void displayCreate (){
        TextView textView = getActivity().findViewById(R.id.cyclesactive);
        String msg = getString(R.string.create);
        textView.setText(msg + "\n");
    }

    public void displayStart (){
        TextView textView = getActivity().findViewById(R.id.cyclesactive);
        String msg = getString(R.string.start);
        textView.append(msg + "\n");
    }

    public void displayPause (){
        String msg = getString(R.string.pause);
        TextView textView = getActivity().findViewById(R.id.cyclesactive);
        textView.setText(msg + "\n");
        textView = getActivity().findViewById(R.id.cyclesactive);
    }

    public void displayRestart (){
        String msg = getString(R.string.restart);
        TextView textView = getActivity().findViewById(R.id.cyclesactive);
        textView.setText(msg + "\n");
    }

    public void displayResume (){
        String msg = getString(R.string.resume);
        TextView textView = getActivity().findViewById(R.id.cyclesactive);
        textView.append(msg + "\n");
    }

    public void displayStop (){
        String msg = getString(R.string.stop);
        TextView textView = getActivity().findViewById(R.id.cyclesactive);
        textView.append(msg + "\n");
    }

    public void displayDestroy (){
        String msg = getString(R.string.destroy);
        TextView textView = getActivity().findViewById(R.id.cyclesactive);
        textView.append(msg + "\n");
    }

}