package com.ennoblesoft.arif.fragmenttransactions;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ennoblesoft.arif.fragmenttransactions.fragments.FragmentA;
import com.ennoblesoft.arif.fragmenttransactions.fragments.FragmentB;

public class MainActivity extends AppCompatActivity {
    FragmentManager manager;
    private static final String ATAG = "FragA";
    private static final String BTAG = "FragB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
    }

    public void AddFragA(View view) {
        FragmentA checkFragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        if (checkFragmentA != null) {
            Toast.makeText(this, "Fragment A Already created", Toast.LENGTH_SHORT).show();
            return;
        }
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();

        transaction.add(R.id.container, fragmentA, ATAG);
        transaction.commit();
    }

    public void RemoveFragA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.remove(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void AddFragB(View view) {
        FragmentB checkFragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        if (checkFragmentB != null) {
            Toast.makeText(this, "Fragment B Already created", Toast.LENGTH_SHORT).show();
            return;
        }
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentB, BTAG);
        transaction.commit();
    }

    public void RemoveFragB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.remove(fragmentB);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void AttachFragA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.attach(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void DetachFragA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.detach(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void AttachFragB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.attach(fragmentB);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void DetachFragB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.detach(fragmentB);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void ShowFragA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.show(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void HideFragA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.hide(fragmentA);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void ShowFragB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.show(fragmentB);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void HideFragB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.hide(fragmentB);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void RepByA(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            FragmentA fragmentA = new FragmentA();
            transaction.replace(R.id.container, fragmentA, ATAG);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void RepByB(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            FragmentB fragmentB = new FragmentB();
            transaction.replace(R.id.container, fragmentB, BTAG);
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A Not found", Toast.LENGTH_SHORT).show();
        }
    }
}
