package com.example.michaeltonon_CENG319Lab1_Ex1;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class TopFragment extends Fragment {

    String[] activity;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        activity = getResources().getStringArray(R.array.list);
        final ListView listView = view.findViewById(R.id.listview);

        String msg;
        msg = getString(R.string.createView) + getString(R.string.topToast);
        Toast.makeText(getContext(), msg, Toast.LENGTH_LONG).show();

        listView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), AIActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), VRActivity.class);
                        startActivity(intent1);
                        break;
                }
            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, activity);
        listView.setAdapter(adapter);

        return view;
    }

    @Override
    public void onStart(){
        super.onStart();
        String msg;
        msg = getString(R.string.start) + getString(R.string.topToast);
        Toast.makeText(getContext(), msg, Toast.LENGTH_LONG).show();
    }

}