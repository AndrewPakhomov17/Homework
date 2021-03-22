package com.example.homework1;

import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link NumberFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NumberFragment extends Fragment {

    private int number;

    private static final String  KEY_PARAM = "number";

    public NumberFragment(int _value)
    {
        setRetainInstance(true);
        number = _value;
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_PARAM,number);
    }

 /*   @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if(savedInstanceState != null)
        {
           number = savedInstanceState.getInt(KEY_PARAM);
        }
    }
    */



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null)
        {
            number = savedInstanceState.getInt(KEY_PARAM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_number, container, false);

        TextView textView = view.findViewById(R.id.number);

        if(number % 2 == 0 ) {
            textView.setTextColor(Color.RED);
        }
        else{
            textView.setTextColor(Color.BLUE);
        }

        textView.setText(String.valueOf(number));


        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}