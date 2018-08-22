package com.ennoblesoft.arif.fragment2fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ennoblesoft.arif.fragment2fragment.fragments.FragmentA;
import com.ennoblesoft.arif.fragment2fragment.fragments.FragmentB;
import com.ennoblesoft.arif.fragment2fragment.interfaces.MyListener;
import com.ennoblesoft.arif.fragment2fragment.settings.Constants;

public class MainActivity extends AppCompatActivity implements MyListener {
    FragmentManager manager;
    private float firstNo = 0, secondNo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getFragmentManager();
        AddFragmentA();
        AddFragmentB();
    }

    private void AddFragmentA() {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containera, fragmentA, Constants.FRAGMENT_A);
        transaction.commit();
    }

    private void AddFragmentB() {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerb, fragmentB, Constants.FRAGMENT_B);
        transaction.commit();
    }

    @Override
    public void addNumbers(float first, float second) {
        this.firstNo = first;
        this.secondNo = second;
        Send2FragB();
    }

    public void Send2FragB() {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(Constants.FRAGMENT_B);
        fragmentB.Add2Numbers(firstNo, secondNo);
    }
}

