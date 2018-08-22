package com.ennoblesoft.arif.fragmentbackstack.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ennoblesoft.arif.fragmentbackstack.R;

/**
 * Created by Arif on 8/8/2018.
 */

public class FragmentA extends Fragment {
    private static final String TAG = "FragA";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView");
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
}
