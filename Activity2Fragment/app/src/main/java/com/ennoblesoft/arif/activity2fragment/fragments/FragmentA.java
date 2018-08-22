package com.ennoblesoft.arif.activity2fragment.fragments;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.ennoblesoft.arif.activity2fragment.MainActivity;
import com.ennoblesoft.arif.activity2fragment.R;

/**
 * Created by Arif on 8/9/2018.
 */

public class FragmentA extends Fragment implements View.OnClickListener {
    private Button btnAdd;
    private TextView tvResult;
    private float a = 0, b = 0;
    private MainActivity.Employee employee;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        //Receive data from Bundle
        /*Bundle bundle = getArguments();
        a = bundle.getFloat("first", 0);
        b = bundle.getFloat("second", 0);*/

        tvResult = view.findViewById(R.id.tv_result);
        btnAdd = view.findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_add:
                Add();
                break;
        }
    }

    private void Add() {
        float sum = a + b;
        tvResult.setText(sum + "");
    }

    public void setData(float first, float second) {
        this.a = first;
        this.b = second;
    }

    public void setEmployee(MainActivity.Employee employee) {
        this.employee = employee;
    }
}
