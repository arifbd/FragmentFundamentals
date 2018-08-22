package com.ennoblesoft.arif.activity2fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.ennoblesoft.arif.activity2fragment.fragments.FragmentA;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    FragmentManager manager;
    private EditText etFirst, etSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();

        etFirst = findViewById(R.id.et_first_no);
        etSecond = findViewById(R.id.et_second_no);
    }

    public void Send2Fragment(View view) {
        float first = Float.parseFloat(etFirst.getText().toString().trim());
        float second = Float.parseFloat(etSecond.getText().toString().trim());

        Log.d(TAG, first + " - " + second);

        //Send data by bundle
        /*Bundle bundle = new Bundle();
        bundle.putFloat("first", (float) first);
        bundle.putFloat("second", (float) second);

        FragmentA fragmentA = new FragmentA();
        fragmentA.setArguments(bundle);*/

        //Send data by Fragment itself
        FragmentA fragmentA = new FragmentA();
        fragmentA.setData(first, second); //passing the primitive type data
        fragmentA.setEmployee(new Employee());//passing non primitive data

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentA, "FragA");
        transaction.commit();
    }

    public class Employee{
        int id;
        String name;
    }
}
