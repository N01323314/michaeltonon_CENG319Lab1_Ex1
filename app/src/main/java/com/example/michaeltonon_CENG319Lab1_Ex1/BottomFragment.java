package com.example.michaeltonon_CENG319Lab1_Ex1;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BottomFragment extends Fragment {

    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bottom, container, false);
        return view;
    }

    public void displayCreate (boolean a){
        TextView textView = getActivity().findViewById(R.id.cyclesactive);
        String msg = getString(R.string.create);
        if (a){
            textView.setText(msg);
        }
    }

    public void displayStart (boolean a){
        TextView textView = getActivity().findViewById(R.id.cyclesactive2);
        String msg = getString(R.string.start);
        if (a){
            textView.append(msg + "\n");
        }
    }

    public void displayPause (boolean a){
        String msg = getString(R.string.pause);
        TextView textView = getActivity().findViewById(R.id.cyclesactive2);
        if (a){
            textView.setText(msg + "\n");
            textView = getActivity().findViewById(R.id.cyclesactive);
            textView.setVisibility(View.GONE);
        }
    }

    public void displayRestart (boolean a){
        String msg = getString(R.string.restart);
        TextView textView = getActivity().findViewById(R.id.cyclesactive2);
        if (a){
            textView.setText(msg + "\n");
        }
    }

    public void displayResume (boolean a){
        String msg = getString(R.string.resume);
        TextView textView = getActivity().findViewById(R.id.cyclesactive2);
        if (a){
            textView.append(msg + "\n");
        }
    }

    public void displayStop (boolean a){
        String msg = getString(R.string.stop);
        TextView textView = getActivity().findViewById(R.id.cyclesactive2);
        if (a){
            textView.append(msg + "\n");
        }
    }

    public void displayDestroy (boolean a){
        String msg = getString(R.string.destroy);
        TextView textView = getActivity().findViewById(R.id.cyclesactive2);
        if (a){
            textView.append(msg + "\n");
        }
    }

}