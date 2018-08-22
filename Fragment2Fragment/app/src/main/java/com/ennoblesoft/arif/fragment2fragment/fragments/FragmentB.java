package com.ennoblesoft.arif.fragment2fragment.fragments;

import android.annotation.SuppressLint;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ennoblesoft.arif.fragment2fragment.R;

public class FragmentB extends Fragment {
    private TextView tvResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        tvResult = view.findViewById(R.id.tv_result);
        return view;
    }

    @SuppressLint("SetTextI18n")
    public void Add2Numbers(float first, float second) {
        float sum = first + second;
        tvResult.setText(sum + "");
    }
}
