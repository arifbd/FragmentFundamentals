package com.ennoblesoft.arif.fragmentbackstack;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ennoblesoft.arif.fragmentbackstack.fragments.FragmentA;
import com.ennoblesoft.arif.fragmentbackstack.fragments.FragmentB;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {
    FragmentManager manager;
    private static final String TAG = MainActivity.class.getSimpleName();
    private static final String ATAG = "FragA";
    private static final String BTAG = "FragB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
        manager.addOnBackStackChangedListener(this);
    }

    public void AddFragA(View view) {
        FragmentA checkFragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        if (checkFragmentA != null) {
            Toast.makeText(this, "Fragment A Already created", Toast.LENGTH_SHORT).show();
        } else {
            FragmentA fragmentA = new FragmentA();
            FragmentTransaction transaction = manager.beginTransaction();

            transaction.add(R.id.container, fragmentA, ATAG);
            transaction.addToBackStack("AddFragA");
            transaction.commit();
        }
    }

    public void RemoveFragA(View view) {
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag(ATAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA != null) {
            transaction.remove(fragmentA);
            transaction.addToBackStack("RemFragA");
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void AddFragB(View view) {
        FragmentB checkFragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        if (checkFragmentB != null) {
            Toast.makeText(this, "Fragment B Already created", Toast.LENGTH_SHORT).show();
        } else {
            FragmentB fragmentB = new FragmentB();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.add(R.id.container, fragmentB, BTAG);
            transaction.addToBackStack("AddFragB");
            transaction.commit();
        }
    }

    public void RemoveFragB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(BTAG);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentB != null) {
            transaction.remove(fragmentB);
            transaction.addToBackStack("RemFragB");
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
            transaction.addToBackStack("AttachFragA");
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
            transaction.addToBackStack("DetachFragA");
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
            transaction.addToBackStack("AttachFragB");
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
            transaction.addToBackStack("DetachFragB");
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
            transaction.addToBackStack("ShowFragA");
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
            transaction.addToBackStack("HideFragA");
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
            transaction.addToBackStack("ShowFragA");
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
            transaction.addToBackStack("HideFragB");
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
            transaction.addToBackStack("ReblaceByFragA");
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
            transaction.addToBackStack("ReblaceByFragB");
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment A Not found", Toast.LENGTH_SHORT).show();
        }
    }

    public void DummyBackButton(View view) {
        manager.popBackStack();
    }

    public void PopAddFragAInclusive(View view) {
        manager.popBackStack("AddFragA", FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    public void PopAddFragB(View view) {
        manager.popBackStack("AddFragB", 0);
    }

    @Override
    public void onBackStackChanged() {
        int length = manager.getBackStackEntryCount();

        StringBuilder message = new StringBuilder("");

        for (int i = length - 1; i >= 0; i--) {
            message.append("Index ").append(i).append(" : ");
            message.append(manager.getBackStackEntryAt(i).getName());
            message.append(" \n");
        }

        Log.d(TAG, "\n" + message.toString() + " \n");
    }
}
