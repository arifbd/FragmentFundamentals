package com.ennoblesoft.arif.fragment2activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ennoblesoft.arif.fragment2activity.fragments.FragmentA;
import com.ennoblesoft.arif.fragment2activity.interfaces.MyListener;

public class MainActivity extends AppCompatActivity implements MyListener {
    private TextView tvResult;
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tv_result);
        manager = getFragmentManager();
        AddFragmentA();
    }

    private void AddFragmentA() {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentA, "FragA");
        transaction.commit();
    }

    @Override
    public void addNumbers(float first, float second) {
        float result = first + second;
        tvResult.setText("Result: " + result);
    }
}
